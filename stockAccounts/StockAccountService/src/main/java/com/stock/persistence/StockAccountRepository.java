package com.stock.persistence;

import java.util.Collection;

import com.stock.domain.StockAccount;

public interface StockAccountRepository {

	/**
	 * Find one stock account by id
	 * 
	 * @param id the id
	 * @return the stock account with matching id, or null if not found.
	 */
	public StockAccount findById(Long id);

	/**
	 * Get all stock accounts in the repository.
	 */
	public Collection<StockAccount> findAll();

	/**
	 * Find stock accounts by name
	 * 
	 * @param name
	 * @return the stock accounts with matching name, or empty collection if none found.
	 */
	public Collection<StockAccount> findByName(String name);

	/**
	 * @return Total number of stock accounts in the repository
	 */
	public long count();

	/**
	 * Save a new stock account
	 * 
	 * @param account stock account to save
	 * @return
	 */
	public StockAccount save(StockAccount account);

	/**
	 * Delete the passed in stock account. Generally deletes the stock account with the passed in id.
	 * 
	 * @param account stock account to delete
	 */
	public void delete(StockAccount account);
}
