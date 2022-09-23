package com.student.dao;

import com.student.dto.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
	List<Student> sList = null;
	Scanner scanner = new Scanner(System.in);

	public List<Student> studentList() {
		sList = new ArrayList<Student>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc", "root",
					"1998");
			if (connection != null) {
				System.out.println("db connected..!");
			}
			Statement statement = connection.createStatement();
			ResultSet rSet = statement.executeQuery("select * from student");
			while (rSet.next()) {
				int id = rSet.getInt(1);
				String name = rSet.getString(2);
				String phone = rSet.getString(3);
				String address = rSet.getString(4);
				Student stu = new Student(id, name, phone, address);
				sList.add(stu);
			}

			connection.close();
		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sList;
	}

}
