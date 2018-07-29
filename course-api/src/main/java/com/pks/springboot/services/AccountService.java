package com.pks.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	 IAccountRepository accountRepository;
	 
	 @Override
	 public Account create(Account account) {
	  return accountRepository.save(account);
	 }

	 @Override
	 public Account get(Long accountId) {
	  return accountRepository.findOne(accountId);
	 }

	 @Override
	 public Account update(Account account, Long accountId) {
	  return accountRepository.save(account);
	 }

	 @Override
	 public void delete(Long accountId) {
	  accountRepository.delete(accountId);
	 }

	 @Override
	 public List<Account> list() {
	  return (List<Account>) accountRepository.findAll();
	 }
	

}
