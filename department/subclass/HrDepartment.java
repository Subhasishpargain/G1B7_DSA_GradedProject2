package com.greatlearning.department.subclass;

import com.greatlearning.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Hr Department";
	}
	public String getTodaysWork () {
		return "Fill todays's timesheet and mark your attendance";
	}
public String getWorkDeadline () {
	return "Complete By EOD";
}
public String doActivity () {
	return "team Lunch";
}
}