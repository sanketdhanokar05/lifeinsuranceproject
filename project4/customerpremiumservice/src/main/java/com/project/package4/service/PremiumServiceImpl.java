package com.project.package4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.package4.entity.Premium;
import com.project.package4.exception.PremiumNotFoundException;
import com.project.package4.repository.PremiumRepository;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium addPremium(Premium premium) {
		Premium newPremium = premiumRepository.save(premium);
		return newPremium;
	}

	@Override
	public Premium viewPremium(int premiumId) {
		Optional<Premium> optionalPremium = premiumRepository.findById(premiumId);
		if (!optionalPremium.isPresent()) {
			throw new PremiumNotFoundException("Sorry! Premium is not existing with id: " + premiumId);
		}

		return optionalPremium.get();
	}

}
