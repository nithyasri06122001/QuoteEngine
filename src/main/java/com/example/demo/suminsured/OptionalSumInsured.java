package com.example.demo.suminsured;

import com.example.demo.entity.QuoteEntity;

public class OptionalSumInsured {
	
	public int findOptionalPremium(int optionalSumInsured,QuoteEntity optionalPremiumList) {
		int optionalPremium=0;
		switch (optionalSumInsured) {
		case 500000: {
			optionalPremium=optionalPremiumList.getFiveLakh();
			break;
		}
		case 1000000: {
			optionalPremium=optionalPremiumList.getTenLakh();
			break;
		}
		case 1500000: {
			optionalPremium=optionalPremiumList.getFifteenLakh();
			break;
		}
		case 2000000: {
			optionalPremium=optionalPremiumList.getTwentyLakh();
			break;
		}
		case 2500000: {
			optionalPremium=optionalPremiumList.getTwentyFiveLakh();
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + optionalSumInsured);
		}
			
      return optionalPremium;
	}

}
