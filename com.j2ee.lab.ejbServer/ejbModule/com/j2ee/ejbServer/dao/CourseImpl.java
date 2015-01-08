package com.j2ee.ejbServer.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.j2ee.ejbServer.model.Course;

public class CourseImpl implements CourseDao {
	private static DaoHelper daoHelper = DaoHelperImpl.getBaseDaoInstance();

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		List<Course> reList = new ArrayList<Course>();
		Connection connection = daoHelper.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select c.cid, c.cname from courses c ";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				reList.add(new Course(resultSet.getInt(1), resultSet
						.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reList;
	}

	@Override
	public Course getCourse(int cid) {
		// TODO Auto-generated method stub
		Course reCourse = null;
		Connection connection = daoHelper.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select c.cid, c.cname from courses c where c.cid="
					+ cid;
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				reCourse = new Course(resultSet.getInt(1),
						resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reCourse;
	}

}
