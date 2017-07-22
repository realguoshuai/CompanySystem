package org.lc;

import java.nio.Buffer;

import org.lc.department.TechDepartment;
import org.lc.design.DepartmentBuilder;

public class Test {

	public static void main(String[] args) {
		DepartmentBuilder deptBuilder = new DepartmentBuilder();
		TechDepartment department = deptBuilder
				.start()
				.buildLeader()
				.buildJavaStaffs()
				.finish();
	}

}
