package com.stock.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

public class StockAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private double balance;
	private SortedMap<String, Stock> heldStocks;

	public StockAccount(Long id, String name, double balance) {
		this(id, name, balance, new TreeMap<String, Stock>());
	}
	
	public StockAccount(Long id, String name, double balance, SortedMap<String, Stock> heldStocks) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.heldStocks = heldStocks;
	}

	public StockAccount(String name) {
		this(0L, name, 1000);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Collection<Stock> getHeldStocks() {
		return heldStocks.values();
	}
	
	public void setHeldStocks(SortedMap<String, Stock> heldStocks) {
		this.heldStocks = heldStocks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
