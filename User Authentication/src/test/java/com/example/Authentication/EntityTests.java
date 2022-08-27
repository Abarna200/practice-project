package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntityTests {

	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("max");
		assertEquals(testUser.getName(),"max");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("max@email.com");
		assertEquals(testUser.getEmail(),"max@email.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("max","max@email.com","123");
		
		User checkUser = new User();
		checkUser.setName("max");
		checkUser.setEmail("max@email.com");
		checkUser.setPassword("123");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}
