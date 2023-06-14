package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.QuoteEntity;

@Repository
public interface QuoteRepository extends JpaRepository<QuoteEntity, Integer> {
	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
    QuoteEntity findWomenCarePremium(int age, int adultCount, int year, String paymentPlan, int productCode);

	@Query(value = "select * from premiumquote where child_count=:childCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
	QuoteEntity findChildPremium(int childCount, int year, String paymentPlan,int productCode);
	
	@Query(value="select * from premiumquote where optional_cover='Yes' and payment_plan=:paymentPlan and product_code=:productCode and year=:year  and :age>=min_age and :age<=max_age" ,nativeQuery=true)
	QuoteEntity findOptionalPremium(String paymentPlan,int productCode,int year,int age);

	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode and child_count=:childCount", nativeQuery = true)
	QuoteEntity findStarComprehensivePremium(int age, int adultCount, int year, String paymentPlan, int productCode,
			int childCount);

	@Query(value = "select * from premiumquote where product_code=:productCode and policy_type=:policyType and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan ", nativeQuery = true)
	QuoteEntity findSeniorCitizenRedCarpetPremium(int adultCount, int year, String paymentPlan, int productCode,
			String policyType);

	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and child_count=:childCount and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
	QuoteEntity findStarMicroRuralAndFarmerCarePremium(int age, int adultCount, int childCount, String paymentPlan,
			int productCode);
	
	@Query(value="select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and child_count=:childCount and policy_plan=:policyPlan and policy_days=:policyDays and product_code=:productCode and year=:year", nativeQuery = true)
	QuoteEntity findStarHospitalCashInsurancePremium(int productCode,int age,int adultCount,int childCount,String policyPlan,int year,int policyDays);
}
