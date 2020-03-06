package com.codechallenge.springboot.app.accounts.models.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codechallenge.springboot.app.accounts.models.entity.Account;

public interface AccountsRepository extends JpaRepository<Account, Long> {

}
