package org.lc.design;

import java.util.ArrayList;
import java.util.List;

import org.lc.department.TechDepartment;
import org.lc.person.TechStaff;

public class DepartmentBuilder implements IBuilder<TechDepartment> {

	private TechDepartment department;

	@Override
	public IBuilder<TechDepartment> start() {
		department = new TechDepartment();
		return this;
	}

	public DepartmentBuilder buildLeader() {
		TechStaff leader = new TechStaff();
		leader.setId(1);
		leader.setAge(30);
		// TODO
		department.setLeader(leader);
		return this;
	}

	public DepartmentBuilder buildJavaStaffs() {
		List<TechStaff> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			TechStaff java = new TechStaff();
			java.setId(i);
			java.setAge(24 + i % 12);
			java.setName("name java" + i);
			java.setJobTitle("java工程师");
			list.add(java);
		}
		department.setStaffs(list);
		return this;
	}

	@Override
	public TechDepartment finish() {
		return department;
	}

}
