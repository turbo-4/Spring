package com.prateek.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	@Autowired(required=false)
	@Qualifier("address2")
	private Address address;

}
