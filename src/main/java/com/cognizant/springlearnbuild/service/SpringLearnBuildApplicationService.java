package com.cognizant.springlearnbuild.service;

import org.springframework.stereotype.Service;

import com.cognizant.springlearnbuild.model.SpringLearnBuildApplicationModel;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SpringLearnBuildApplicationService {

	public String validateCredentials(SpringLearnBuildApplicationModel model) {
		log.info("START:::");
		log.info("::Inside SpringLearnBuildApplicationService::");
		log.info("END:::");
		if ((model.getUserName().equalsIgnoreCase("admin")) && (model.getPassWord().equalsIgnoreCase("admin"))) {
			return "Successfully logged in";
		} else {
			return "Invalid credentials";
		}
	}

}
