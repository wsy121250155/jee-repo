package com.j2ee.ejbServer.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.j2ee.ejbServer.model.CourseEo;
import com.j2ee.ejbServer.po.Course;

@Stateless
public class CourseImpl implements CourseDao {

	@PersistenceContext
	protected EntityManager em;

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from courses c order by cid asc");
		@SuppressWarnings("unchecked")
		List<CourseEo> list = query.getResultList();
		em.clear();
		List<Course> reList = new ArrayList<Course>();
		for (CourseEo ce : list) {
			reList.add(new Course(ce));
		}
		return reList;
	}

	@Override
	public Course getCourse(int cid) {
		// TODO Auto-generated method stub
		CourseEo courseEo = em.find(CourseEo.class, cid);
		Course course = new Course(courseEo);
		return course;
	}
	// private static DaoHelper daoHelper = DaoHelperImpl.getBaseDaoInstance();
	//
	// @Override
	// public List<Course> getCourseList() {
	// // TODO Auto-generated method stub
	// List<Course> reList = new ArrayList<Course>();
	// Connection connection = daoHelper.getConnection();
	// try {
	// Statement statement = (Statement) connection.createStatement();
	// String sql = "select c.cid, c.cname from courses c ";
	// ResultSet resultSet = statement.executeQuery(sql);
	// while (resultSet.next()) {
	// reList.add(new Course(resultSet.getInt(1), resultSet
	// .getString(2)));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return reList;
	// }
	//
	// @Override
	// public Course getCourse(int cid) {
	// // TODO Auto-generated method stub
	// Course reCourse = null;
	// Connection connection = daoHelper.getConnection();
	// try {
	// Statement statement = (Statement) connection.createStatement();
	// String sql = "select c.cid, c.cname from courses c where c.cid="
	// + cid;
	// ResultSet resultSet = statement.executeQuery(sql);
	// while (resultSet.next()) {
	// reCourse = new Course(resultSet.getInt(1),
	// resultSet.getString(2));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return reCourse;
	// }

}
