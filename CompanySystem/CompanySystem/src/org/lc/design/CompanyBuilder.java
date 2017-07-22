package org.lc.design;

import org.lc.Company;
import org.lc.department.TechDepartment;

public class CompanyBuilder implements IBuilder<Company>{

	private Company company;

	@Override
	public IBuilder<Company> start() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBuilder<Company> buildLeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBuilder<Company> buildJavaStaffs() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public IBuilder<Company> buildAllDepartment(){
		DepartmentBuilder deptBuilder = new DepartmentBuilder();
		TechDepartment techDepartment = deptBuilder
				.start()
				.buildLeader()
				.buildJavaStaffs()
				.finish();
			company.setTechDepartment(techDepartment);
			
			//TODO build另一个部门
			
			//TODO build另一个部门
			
			//TODO build另一个部门
			
			//TODO build另一个部门
		return this;
	}

	@Override
	public Company finish() {
		
		return null;
	}
	
	public void showAllMsg(){
		System.out.println(company.toString());
	}
	
	
	
	
}
