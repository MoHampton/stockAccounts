package com.stock.service;

import java.util.Collection;

import com.stock.domain.StockAccount;

public interface StockAccountService {
	
	public void persist(StockAccount item);

	public void persistBatch(Collection<StockAccount> items);

	public void remove(StockAccount item);

	public StockAccount findById(Long id);

	public Collection<StockAccount> findAll();

	public Collection<StockAccount> findByName(String name);

	public long size();
}
