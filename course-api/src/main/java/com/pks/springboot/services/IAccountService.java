package com.pks.springboot.services;

import java.util.List;

public interface IAccountService {

	Account create(Account account);

	Account get(Long accountId);

	Account update(Account account, Long accountId);

	void delete(Long accountId);

	List<Account> list();
	

}
