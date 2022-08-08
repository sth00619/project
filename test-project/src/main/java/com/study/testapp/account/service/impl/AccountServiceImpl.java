package com.study.testapp.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.testapp.account.mapper.AccountMapper;
import com.study.testapp.account.service.AccountService;
import com.study.testapp.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountMapper accountMapper;
	
	@Override
	public void join(Account account) {
		accountMapper.insertAccount(account);
	}
	
}
