package com.project.package4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.package4.entity.Premium;
import com.project.package4.service.PremiumService;


@RestController
@RequestMapping("/premium")
public class PremiumController {

	@Autowired
	private PremiumService premiumService;

	@PostMapping("/newpremium")
	 public ResponseEntity<Premium> newPremium(@RequestBody Premium premium) {
		 Premium newPremium =premiumService.addPremium(premium);
		 
		 ResponseEntity<Premium> responseEntity = new ResponseEntity<Premium>(newPremium,HttpStatus.CREATED);
			return responseEntity;
			
	 }
	 
	@PostMapping("/updatepremium")
	public ResponseEntity<Premium> updatedPremium(Premium premium) {

         Premium updatedPremium =premiumService.addPremium(premium);
    
		 ResponseEntity<Premium> responseEntity= new ResponseEntity<Premium>(updatedPremium,HttpStatus.CREATED);
			return responseEntity;
	}
	 
//	 @GetMapping("/delete/{pid}")
//		public ResponseEntity<?> deletedPremium(@PathVariable("pid")int premiumId){
//			
//		    premiumService.deletePremium(premiumId);
//			return new ResponseEntity<>("Customer Deleted with id: "+premiumId,HttpStatus.OK);
//			
//		}
//	 
//	 @GetMapping("/view/{pid}")
//		public ResponseEntity<?> viewAllPremium(@PathVariable("premiumId") int premiumId)
//		{
//		 Premium premium=premiumService.viewPremium(premiumId);
//			return new ResponseEntity<>(premium, HttpStatus.OK);
//			
//		}
}
