package com.stock.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stock.domain.StockAccount;
import com.stock.persistence.StockAccountRepository;
import com.stock.service.StockAccountService;

public class StockAccountTest {

	private AnnotationConfigApplicationContext ctx;
	
	@Before 
	public void setup() {
		ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		assertNotNull("spring container should not be null", ctx);
	}
	
	@After
	public void tearDown() {
		ctx.close();
	}
	
	@Test
	public void testRepositoryLookupPositive() {
		StockAccountRepository repository = ctx.getBean(StockAccountRepository.class);
		
		assertNotNull(repository);
	}
	
	@Test
	public void testServiceLookupPositive() {
		StockAccountService service = ctx.getBean(StockAccountService.class);
		
		assertNotNull(service);
	}
	
	@Test
	public void testServicePositive() {
		StockAccountService service = ctx.getBean(StockAccountService.class);
		
		assertNotNull(service);
		
		Collection<StockAccount> accounts = service.findAll();
		assertTrue(accounts.size() > 0);
		
		StockAccount account = service.findById(1L);
		assertNotNull(account);
	}
	
}
