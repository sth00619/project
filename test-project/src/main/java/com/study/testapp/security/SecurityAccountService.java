package com.study.testapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.study.testapp.account.mapper.AccountMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityAccountService implements UserDetailsService {
	@Autowired
	AccountMapper accountMapper;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		SecurityAccount account = new SecurityAccount(accountMapper.getAccountById(id));
		boolean result = new BCryptPasswordEncoder().matches(account.getPassword(), "1234");
		System.out.println(result);
		return account;
	}
}