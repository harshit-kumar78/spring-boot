package com.example;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/harshit")
public class ControllerAPI {
	
	@GetMapping(value="/get")
	public ResponseEntity<List<List<Integer>>> getData() {
		
		return new ResponseEntity<>(List.of(List.of(1,2,3,4)),HttpStatus.BAD_GATEWAY);
	}
}
