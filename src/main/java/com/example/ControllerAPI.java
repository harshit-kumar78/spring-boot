package com.example;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



class Customer {
	private String name="harshit";
	public int age=23;
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
}
@RestController
@RequestMapping(value="/harshit")
public class ControllerAPI {
	
	@GetMapping(value="/get")
	public ResponseEntity<Customer> getData() {
//		String response = "get data";
//		Customer c = new Customer("harshit",43);
		return new ResponseEntity<>(new Customer(),HttpStatus.OK);
	}
	@PostMapping(value="/post")
	public ResponseEntity<String> postData() {
		String response = "post data";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="/put")
	public ResponseEntity<String> putData() {
		String response = "put data";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> deleteData() {
		String response = "delete data";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
