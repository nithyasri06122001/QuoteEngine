package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payload.RequestData;
import com.example.demo.Service.QuoteService;

@CrossOrigin(allowedHeaders  = "*")
@RestController

public class QuoteController {
	@Autowired
	private QuoteService quoteService;
	
	@CrossOrigin
	@PostMapping(path = "/premium", produces = "application/json")
	public ResponseEntity<Object> findPremium(@RequestBody RequestData data) {
		return new ResponseEntity<>(quoteService.findPremium(data), HttpStatus.OK);

	}
}
