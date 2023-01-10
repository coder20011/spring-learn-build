package com.cognizant.springlearnbuild.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearnbuild.model.SpringLearnBuildApplicationModel;
import com.cognizant.springlearnbuild.service.SpringLearnBuildApplicationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/spring-learn-build")
@Slf4j
public class SpringLearnBuildApplicationController {
	
	@Autowired
	private SpringLearnBuildApplicationService service;
	
	@GetMapping(path = "/health-check")
	public String healthCheck() {
		log.info("START:::");
		log.info("::Inside healthCheck()::");
		log.info("END:::");
		return "Ok";
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<String> login(@RequestBody SpringLearnBuildApplicationModel model) {
		log.info("START:::");
		log.info("::Inside login()::");
		log.info("END:::");
		return ResponseEntity.ok(service.validateCredentials(model));
	}

}
