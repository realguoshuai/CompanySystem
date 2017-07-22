package org.lc.person;

import org.lc.callback.IStaff;
import org.lc.core.Person;

public abstract class Staff extends Person implements IStaff{
	private String mobile;
	private String jobTitle;
	private int salary;
	//TODO

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	

}
