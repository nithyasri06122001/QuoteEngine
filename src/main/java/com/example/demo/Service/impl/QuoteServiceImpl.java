package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Service.QuoteService;
import com.example.demo.payload.RequestData;
import com.example.demo.products.WomenCare;
@Service
public class QuoteServiceImpl implements QuoteService{

	@Override
	public Object findPremium(RequestData data) {
		int productCode=data.getProductCode();
		
		WomenCare womenCare=new WomenCare();
		
		switch (productCode){
		case 1: {
			womenCare.findWomenCarePremium(data);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + productCode );
		}
		
		return null;
	}
}