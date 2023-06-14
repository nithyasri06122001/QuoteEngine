package com.example.demo.products;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.QuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.repository.QuoteRepository;
import com.example.demo.suminsured.OptionalSumInsured;
import com.example.demo.suminsured.SumInsured;

public class WomenCare{
	  @Autowired
      private QuoteRepository quoteRepository; 
      OptionalSumInsured optional=new OptionalSumInsured();
      
      SumInsured sumInsuredObject=new SumInsured();
	
	
          public Object findWomenCarePremium(RequestData data) {
        	    int productCode=data.getProductCode();
        		int age=data.getAge();
        		int adultCount=data.getAdultCount();
        		int childCount=data.getChildCount();
        		int sumInsured=data.getSumInsured();
        		String paymentPlan=data.getPaymentPlan();
        		String optionalCover=data.getOptionalCover();
        		int optionalSumInsured=data.getOptionalSumInsured();
        		  		
       
        		
        		Map<Integer, Object> quote = new HashMap<>();
        		for (int year = 1; year <= 3; year++) {
        			QuoteEntity premiumEntity = new QuoteEntity();
        			QuoteEntity childPremiumList = new QuoteEntity();
        			QuoteEntity optionalPremiumList= new QuoteEntity();
        		
        			int optionlPremium=0;
        			int premium=0;    		
        				premiumEntity = quoteRepository.findWomenCarePremium(age, adultCount, year, paymentPlan,productCode);
        				if (childCount > 0) {
        					childPremiumList = quoteRepository.findChildPremium(childCount, year,paymentPlan,productCode);
        				}
        				if(optionalCover.equalsIgnoreCase("Yes")) {
        					optionalPremiumList=quoteRepository.findOptionalPremium(paymentPlan, productCode,year,age);		
        			    }
        				if(optionalSumInsured>0 && optionalCover.equalsIgnoreCase("Yes")) {
        				optionlPremium=optional.findOptionalPremium(optionalSumInsured, optionalPremiumList);
        				}
        				premium=sumInsuredObject.findTotalPremium(sumInsured, childCount, premiumEntity, productCode, childPremiumList, optionlPremium);
        				
        				quote.put(year,premium);
        				
        		}
        	  return quote;
          }
}

