package com.cjc.main.servciesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EnquiryDetails;
import com.cjc.main.repository.EnquiryRepository;
import com.cjc.main.servciesI.EnquiryServciesI;
@Service
public class EnquiryServciesImpl implements EnquiryServciesI
{
	
	@Autowired private EnquiryRepository repo;

	@Override
	public EnquiryDetails saveData(EnquiryDetails e) {
		
		return repo.save(e);
	}
}
