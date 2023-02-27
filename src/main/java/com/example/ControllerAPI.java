package com.example;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	private String hello;
	public Customer(String name,int age,String hello) {
		this.name = name;
		this.age = age;
		this.hello = hello;
	}
	public String getName() {
		return this.name;
	}
//	public int getAge() {
//		return this.age;
//	}
//	
//	public String getHello() {
//		return this.hello;
//	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", hello=" + hello + "]";
	}
	
}
@RestController
@RequestMapping(value="/harshit")
public class ControllerAPI {
	
//	@GetMapping(value="/get/{pathvariable}/{age}")
//	public ResponseEntity<Customer> getData(@PathVariable() String pathvariable ,@PathVariable("age") Integer years) {
////		String response = "get data";
//		Customer c = new Customer(pathvariable,years);
//		return new ResponseEntity<>(c,HttpStatus.OK);
//	}
	@PostMapping(value="/post")
	public ResponseEntity<Customer> postData(@RequestBody Customer c) {
//		Customer c = new Customer("harshit",23);
		System.out.println(c);
		return new ResponseEntity<>(c,HttpStatus.CREATED);
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
