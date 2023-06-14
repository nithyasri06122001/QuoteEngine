package com.example.demo.suminsured;

import com.example.demo.entity.QuoteEntity;

public class SumInsured {
     public int findTotalPremium(int sumInsured,int childCount,QuoteEntity premiumEntity,int productCode,QuoteEntity childPremiumList,int optionlPremium) {
    	 int totalPremium=0;
    	 int childPremium=0;
    	 switch (sumInsured){
			
			case 1000: {
				totalPremium= premiumEntity.getOnrThousand() + childPremium;
				break;
			}
			case 2000: {
				totalPremium= premiumEntity.getTwoThounsand() + childPremium;
				break;
			}
			
			case 3000: {
				totalPremium= premiumEntity.getThreeThousand() + childPremium;
				break;
			}
			
			case 100000: {
				totalPremium= premiumEntity.getOneLakh() + childPremium;
				break;
			}
			case 200000: {
				totalPremium= premiumEntity.getTwoLakh() + childPremium;
				break;
			}
			case 300000: {
				totalPremium= premiumEntity.getThreeLakh() + childPremium;
				break;
			}
			case 400000: {
				totalPremium= premiumEntity.getFourLakh() + childPremium;
				break;
			}
			case 500000: {
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getFiveLakh();
				}
				totalPremium= premiumEntity.getFiveLakh() + childPremium+optionlPremium;
				break;
			}
			case 750000: {
				totalPremium= premiumEntity.getSevenLakhFiftyThousand() + childPremium;
				break;
			}
			case 1000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getTenLakh();
				}
				totalPremium= premiumEntity.getTenLakh() + childPremium+optionlPremium;
				break;
			}
			case 1500000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getFifteenLakh();
				}
				totalPremium= premiumEntity.getFifteenLakh() + childPremium+optionlPremium;
				break;
			}
			case 2000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getTwentyLakh();
				}
				totalPremium= premiumEntity.getTwentyLakh() + childPremium+optionlPremium;
				break;
			}
			case 2500000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getTwentyFiveLakh();
				}
				totalPremium= premiumEntity.getTwentyFiveLakh() + childPremium+optionlPremium;
				break;
			}
			case 5000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getFiftyLakh();
				}
				totalPremium= premiumEntity.getFiftyLakh() + childPremium+optionlPremium;
				break;
			}
			case 7500000: {
				totalPremium= premiumEntity.getSeventyFiveLakh() + childPremium;
				break;
			}
			case 10000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getOneCrore();
				}
				totalPremium=  premiumEntity.getOneCrore() + childPremium+optionlPremium;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + sumInsured);
			}
    	 return totalPremium;
     }
}
