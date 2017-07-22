package org.lc.department;

import org.lc.core.AbstractDepartment;
import org.lc.person.TechStaff;

public class TechDepartment extends AbstractDepartment<TechStaff>{
	
	@Override
	public void duty() {
		System.out.println("开发程序");
		System.out.println("调试程序");
		//TODO
	}

	@Override
	public void authority() {
		System.out.println("修改产品功能");
		System.out.println("发版本");
		System.out.println("向boss和技术相关的事宜提意见");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
