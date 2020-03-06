package com.codechallenge.springboot.cucumber.bdd.stepdefs;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.fail;

import cucumber.api.java8.En;

import io.cucumber.datatable.DataTable;

import io.restassured.response.Response;

import java.util.List;

import com.codechallenge.springboot.app.customers.models.entity.Customer;



/**

 * Step Definition Class for Transaction.

 *

 * <p>Uses Java Lambda style step definitions so that we don't need to worry

 * about method naming for each step definition</p>

 */

public class CustomerSteps extends AbstractSteps implements En {



  public CustomerSteps() {



    Given("user wants to create an transactionwith the following attributes", (DataTable transactionDt) -> {

      testContext().reset();

      List<Customer> transactionList = transactionDt.asList(Customer.class);



      // First row of DataTable has the transactionattributes hence calling get(0) method.

      super.testContext()

          .setPayload(transactionList.get(0));

    });



//    And("with the following Account", (DataTable transactionDt) -> {
//
//      List<Customer> transactionList = transactionDt.asList(Customer.class);
//
//      super.testContext()
//
//          .getPayload(Customer.class).setReference("12345A");
//
//    });
//    
//    And("with the following Channel", (DataTable transactionDt) -> {
//
//        List<Customer> transactionList = transactionDt.asList(Customer.class);
//
//        super.testContext()
//
//            .getPayload(Customer.class).setReference("CLIENT");
//
//      });


    When("user saves the new transaction{string}", (String testContext) -> {

      String createTransactionUrl = "/v1/transaction";



      // AbstractSteps class makes the POST call and stores response in TestContext

      executePost(createTransactionUrl);

    });



    /**

     * This can be moved to a Class named 'CommonSteps.java so that it can be reused.

     */

    Then("the save {string}", (String expectedResult) -> {

      Response response = testContext().getResponse();



      switch (expectedResult) {

        case "IS SUCCESSFUL":

          assertThat(response.statusCode()).isIn(200, 201);

          break;

        case "FAILS":

          assertThat(response.statusCode()).isBetween(400, 504);

          break;

        default:

          fail("Unexpected error");

      }

    });



  }

}