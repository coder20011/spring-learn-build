package com.cognizant.springlearnbuild.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SpringLearnBuildApplicationModel {
	
	private String userName;
	private String passWord;

}
