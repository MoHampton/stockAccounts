package com.stock.service;

import java.util.Collection;

import com.stock.domain.StockAccount;
import com.stock.persistence.StockAccountRepository;

public class StockAccountServiceImpl implements StockAccountService {

	private StockAccountRepository accountRepository;

	
	public StockAccountServiceImpl(StockAccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void persist(StockAccount account) {
		accountRepository.save(account);

	}

	@Override
	public void persistBatch(Collection<StockAccount> accounts) {
		for (StockAccount account : accounts) {
			accountRepository.save(account);	
		}
		
		System.out.println("If you are seeing this, persistBatch ended normally!");
	}

	@Override
	public void remove(StockAccount account) {
		accountRepository.delete(account);
	}

	@Override
	public StockAccount findById(Long id) {
		return accountRepository.findById(id);
	}

	@Override
	public Collection<StockAccount> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Collection<StockAccount> findByName(String name) {
		return accountRepository.findByName(name);
	}

	@Override
	public long size() {
		return accountRepository.count();
	}

}
