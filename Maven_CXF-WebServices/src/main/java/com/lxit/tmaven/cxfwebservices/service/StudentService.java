package com.lxit.tmaven.cxfwebservices.service;

import javax.jws.WebService;

@WebService
public interface StudentService {

	public Student getStu(String name);
	
}
