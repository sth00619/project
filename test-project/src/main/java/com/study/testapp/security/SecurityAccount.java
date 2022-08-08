package com.study.testapp.security;

import com.study.testapp.model.Account;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SecurityAccount extends User {
	private static final long serialVersionUID = 1L;

	public SecurityAccount(Account account) {
		super(account.getId(), account.getPassword(), AuthorityUtils.createAuthorityList(account.getRole()));
	}
}
