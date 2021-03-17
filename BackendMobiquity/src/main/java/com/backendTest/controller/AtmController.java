package com.backendTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendTest.model.Address;
import com.backendTest.service.AtmService;

@RestController
@RequestMapping("/atms")
public class AtmController {

	@Autowired
	AtmService service;
	
	
	 @GetMapping(value = "/allAtm")
	    public ResponseEntity<String> allEmployeesMethod() {
	        return service.employeeResponse();
	    }
	 
	 @GetMapping(value = "/atmCity/{city}")
	    public ResponseEntity<Address> employeeCity(@PathVariable("city") String city) {
	        return service.getAddressByCity(city);
	    }
}
