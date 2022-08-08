package com.study.testapp.account.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.study.testapp.model.Account;

@Mapper
public interface AccountMapper {
	Account getAccountById(String id);
	void insertAccount(Account account);
}
