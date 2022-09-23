package com.student.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.StudentDao;
import com.student.dto.Student;

public class StudentBusinessImpl implements StudentBusiness {

	@Autowired
	private StudentDao studentDao;

	List<Student> student = studentDao.studentList();

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> insertStudentList(Student student) {
		return null;
	}

	public void specificStudentDetails(String id) {

	}

	public void updateStudentData(String id) {

	}

	public void viewStudentDetials() {
		if (student != null) {
			for (Student std : student) {
				System.out.println("Id : " + std.getId() + ", Name " + std.getName() + ", phone " + std.getPhone()
						+ ", address " + std.getAddress());
			}
		} else {
			System.out.println("Source not found..!");
		}

	}

}
