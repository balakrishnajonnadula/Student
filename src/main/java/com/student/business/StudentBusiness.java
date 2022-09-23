package com.student.business;

import java.util.List;

import com.student.dto.Student;

public interface StudentBusiness {
	public void viewStudentDetials();

	public List<Student> insertStudentList(Student student);

	public void specificStudentDetails(String id);

	public void updateStudentData(String id);
}
