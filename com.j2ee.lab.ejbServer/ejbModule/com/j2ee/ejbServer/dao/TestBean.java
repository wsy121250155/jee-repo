package com.j2ee.ejbServer.dao;

import javax.ejb.Stateless;

import com.j2ee.ejbServer.service.TestService;
@Stateless
public class TestBean implements TestService{

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "ejb remote test success";
	}

}
