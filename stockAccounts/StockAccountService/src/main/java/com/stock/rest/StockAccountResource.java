package com.stock.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.domain.StockAccount;
import com.stock.service.StockAccountService;

//DONE: Declare the class is a REST Controller
@RestController
//TODO Map the entire class to the /accounts URI
@RequestMapping("/accounts")
public class StockAccountResource {

	// TODO Inject the stock account service
	@Autowired
	StockAccountService stk;

	// TODO Create a method to retrieve all the stock accounts
	@RequestMapping
	public Collection<StockAccount> getAllAccounts() {
		Collection<StockAccount> results = stk.findAll();
		return results;
	}

	// TODO Create a method to retrieve a stock account by id
	@RequestMapping("/{id}")
	public StockAccount findItem(@PathVariable("id") Long id) {
		return stk.findById(id);
	}

	// TODO Create a method to retrieve a stock account by name
	@RequestMapping("/{name}")
	public Collection<StockAccount> findByName(@PathVariable("name") String name) {
		return stk.findByName(name);
	}

}
