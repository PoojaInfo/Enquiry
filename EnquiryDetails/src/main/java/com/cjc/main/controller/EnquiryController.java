package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.servciesI.EnquiryServciesI;
@RequestMapping("/enquiry")
@RestController
public class EnquiryController
{
	@Autowired private EnquiryServciesI esi;
	
	@PostMapping("/postData")
	public ResponseEntity<EnquiryDetails> saveData(@RequestBody  EnquiryDetails e)
	{
		
		EnquiryDetails		enquiry	=		esi.saveData(e);
		return new ResponseEntity<EnquiryDetails>(enquiry,HttpStatus.CREATED);
		
	}
	
}
