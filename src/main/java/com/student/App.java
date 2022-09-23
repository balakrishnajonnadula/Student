package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.business.StudentBusiness;
import com.student.business.StudentBusinessImpl;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("com/student/StudentMetaData.xml");
		StudentBusiness sDao = (StudentBusinessImpl) aContext.getBean("studentBusiness");
		sDao.viewStudentDetials();

	}
}
