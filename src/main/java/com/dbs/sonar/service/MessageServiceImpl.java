package com.dbs.sonar.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {

	public String getMessage() {
		// TODO Auto-generated method stub
		String str = "Sonarqube learning";
		Object obj = getObject();  
		System.out.println(obj.toString());
		return str;
	}

	private Object getObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
