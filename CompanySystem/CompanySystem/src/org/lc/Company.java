package org.lc;

import java.util.Date;
import java.util.List;

import org.lc.core.BaseEntity;
import org.lc.department.TechDepartment;
import org.lc.person.Boss;

public class Company extends BaseEntity{
	private long capital;
	private List<String> telList;
	private String address;
	private Date establishDate;
	private List<Boss> bosses;
	private TechDepartment techDepartment;
	private List<String> bankCardList;
	//TODO
	public long getCapital() {
		return capital;
	}
	public void setCapital(long capital) {
		this.capital = capital;
	}
	public List<String> getTelList() {
		return telList;
	}
	public void setTelList(List<String> telList) {
		this.telList = telList;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getEstablishDate() {
		return establishDate;
	}
	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}
	public List<Boss> getBosses() {
		return bosses;
	}
	public void setBosses(List<Boss> bosses) {
		this.bosses = bosses;
	}
	public TechDepartment getTechDepartment() {
		return techDepartment;
	}
	public void setTechDepartment(TechDepartment techDepartment) {
		this.techDepartment = techDepartment;
	}
	public List<String> getBankCardList() {
		return bankCardList;
	}
	public void setBankCardList(List<String> bankCardList) {
		this.bankCardList = bankCardList;
	}
	
	@Override
	public String toString() {
		
		System.out.println("公司的老板是: ");
		for (Boss b : bosses) {
			System.out.println(b);
		}
		
		System.out.println("公司的基本信息是:");
		
		System.out.println("注册资金 : "+capital+" 地址: "+address);
		
		System.out.println("技术部的信息为: ");
		System.out.println(techDepartment);
		
		return "";
	}
	
	
}
