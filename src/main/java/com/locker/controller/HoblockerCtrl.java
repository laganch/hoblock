package com.locker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.locker.model.Hoblocker;
import com.locker.service.HoblockerService;

@RequestMapping("/locker")
@RestController
public class HoblockerCtrl {

	private HoblockerService service;

	@Autowired
	public HoblockerCtrl(HoblockerService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Hoblocker>> getEmployees(){
		List<Hoblocker> employee = service.getLocker();
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Hoblocker> getEmployeeById(@PathVariable("id") Long id){
		Hoblocker employee = service.getLockerById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
