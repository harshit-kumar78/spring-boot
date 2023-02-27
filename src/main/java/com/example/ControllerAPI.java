package com.example;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



class Customer {
	private String name ;
	public int age;
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
	
	@GetMapping(value="/get/{pathvariable}/{age}")
	public ResponseEntity<Customer> getData(@PathVariable() String pathvariable ,@PathVariable("age") Integer years) {
//		String response = "get data";
		Customer c = new Customer(pathvariable,years);
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	@PostMapping(value="/post")
	public ResponseEntity<Customer> postData(@RequestParam("url") String name,@RequestParam Integer age) {
		Customer c = new Customer(name,age);
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
