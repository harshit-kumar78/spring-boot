package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



class Customer {
	private String name ;
	private int age;
	public Customer(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
@RestController
@RequestMapping(value="/harshit")
public class ControllerAPI {
	
	@GetMapping(value = "/customers/{customerId}")
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable Integer customerId) throws Exception {
		ResponseEntity<Customer> response = null;
		
			Customer customer = new Customer("pankaj",23);
			//response=new ResponseEntity<>(customer,HttpStatus.OK);
		
			throw new Exception("from exception");
//			
		
		//return response;
	}

}
