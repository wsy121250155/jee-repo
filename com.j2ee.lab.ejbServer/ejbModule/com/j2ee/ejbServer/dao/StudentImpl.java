package com.j2ee.ejbServer.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.j2ee.ejbServer.model.Student;

public class StudentImpl implements StudentDao {
	private static DaoHelper daoHelper = DaoHelperImpl.getBaseDaoInstance();

	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Student stu = null;
		Connection connection = daoHelper.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from students where sid=" + sid;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				stu = new Student(sid, resultSet.getString(2),
						resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
}
