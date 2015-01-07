package com.j2ee.ejbServer.service;

import javax.ejb.Remote;

@Remote
public interface TestService {
	public String test();
}
