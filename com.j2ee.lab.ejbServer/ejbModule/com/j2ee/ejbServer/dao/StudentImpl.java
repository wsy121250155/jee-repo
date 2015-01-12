package com.j2ee.ejbServer.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.j2ee.ejbServer.model.StudentEo;
import com.j2ee.ejbServer.po.Student;

@Stateless
public class StudentImpl implements StudentDao {
	@PersistenceContext
	protected EntityManager em;

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		if (null == em)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		StudentEo studentEo = em.find(StudentEo.class, sid);
		Student student = new Student(studentEo);
		return student;
	}

	// private static DaoHelper daoHelper = DaoHelperImpl.getBaseDaoInstance();
	//
	// public Student getStudent(int sid) {
	// // TODO Auto-generated method stub
	// Student stu = null;
	// Connection connection = daoHelper.getConnection();
	// try {
	// Statement statement = (Statement) connection.createStatement();
	// String sql = "select * from students where sid=" + sid;
	// ResultSet resultSet = statement.executeQuery(sql);
	// while (resultSet.next()) {
	// stu = new Student(sid, resultSet.getString(2),
	// resultSet.getString(3));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return stu;
	// }
}
