package org.lc.core;

import java.util.List;

import org.lc.callback.IDepartment;

public abstract class AbstractDepartment<T> extends BaseEntity implements IDepartment {
	private Person leader;
	private List<T> staffs;
	private String address;
	private List<String> telList;

	public Person getLeader() {
		return leader;
	}

	public void setLeader(Person leader) {
		this.leader = leader;
	}

	public List<T> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<T> staffs) {
		this.staffs = staffs;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getTelList() {
		return telList;
	}

	public void setTelList(List<String> telList) {
		this.telList = telList;
	}

}
