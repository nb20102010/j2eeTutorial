package com.runli.domain;

import java.util.Date;

/*
 * domain object/javabean/pojo
 */
public class Employee {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date hiredate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
}
