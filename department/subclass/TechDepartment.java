package com.greatlearning.department.subclass;

import com.greatlearning.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork () {
		return "Complete coding of Module 1";
	}
public String getWorkDeadline () {
	return "Complete By EOD";
}
public String  getStackInformation() {
	return "Core java";
}
}
