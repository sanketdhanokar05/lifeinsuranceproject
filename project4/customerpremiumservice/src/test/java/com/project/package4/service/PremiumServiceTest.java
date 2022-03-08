package com.project.package4.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Optional;
import com.project.package4.entity.Premium;
import com.project.package4.repository.PremiumRepository;

public class PremiumServiceTest {
	
	@InjectMocks
	private PremiumService premiumService = new PremiumServiceImpl();
	
	@Mock
	private PremiumRepository premiumRepository;
	
	@Test
    public void testSavePremium() {
       
		Premium premium = new Premium();
        premium.setPremiumId(3);
        premium.setCustomerId(103);
        premium.setPremiumAmount(2465.5);
        premium.setPaidDate(LocalDate.of(2020, 03, 05));
        premium.setProductId(106);
        premium.setDueDate(LocalDate.of(2022, 03, 03));
        premium.setStatus("Sucess");
           
       
        when(premiumRepository.save(premium)).thenReturn(premium);
       
        Premium newPremium = premiumService.addPremium(premium);
       
        //assertEquals(product.getProductName(), newProduct.getProductName(customerProduct));
       
        verify(premiumRepository,times(1)).save(premium);       
       
    }
	
	@Test
	public void testgetPremiumDetails() {
		
			Premium premium = new Premium();
	        premium.setPremiumId(3);
	        premium.setCustomerId(103);
	        premium.setPremiumAmount(2465.5);
	        premium.setPaidDate(LocalDate.of(2020, 03, 03));
	        premium.setProductId(106);
	        premium.setDueDate(LocalDate.of(2022, 03, 03));
	        premium.setStatus("Sucess");
		
		int premiumId=1;
		Optional<Premium> option=Optional.of(premium);
		
		when(premiumRepository.findById(3)).thenReturn(option);
		
		Premium existing=premiumService.viewPremium(premiumId);
		
		assertEquals(premium.getPremiumId(),existing.getPremiumId());	
	}
}