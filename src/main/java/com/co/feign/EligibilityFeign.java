package com.co.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.co.entity.Eligibility;

@FeignClient(name="ED-Module")
public interface EligibilityFeign {
	
	@GetMapping("/eligibility/appNumber/{appNumber}")
	public ResponseEntity<Eligibility> getEligibilityByAppNumber(@PathVariable Integer appNumber);

}
