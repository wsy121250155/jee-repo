package com.j2ee.ejbServer.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.j2ee.ejbServer.model.CourseEo;
import com.j2ee.ejbServer.model.CourseRecordEo;
import com.j2ee.ejbServer.po.CourseRecord;

@Stateless
public class CourseRecordImpl implements CourseRecordDao {
	@PersistenceContext
	protected EntityManager em;

	// private static DaoHelper daoHelper = DaoHelperImpl.getBaseDaoInstance();

	@Override
	public List<CourseRecord> getCourseRecords(int sid) {
		// TODO Auto-generated method stub
		// 无奈之下改成先查所有的；然后又无奈之下按照序号从1到N查
		// Query query =
		// em.createQuery("from courserecords cr order by id asc");
		// @SuppressWarnings("unchecked")
		// List<CourseRecordEo> list = query.getResultList();
		// 上面这种一下在查所有的方法跑步起来。
		List<CourseRecordEo> list = new ArrayList<CourseRecordEo>();
		CourseRecordEo courseRecordEo;
		for (int i = 0; i < 4; i++) {
			courseRecordEo = (CourseRecordEo) em.find(CourseRecordEo.class,
					i + 1);
			if (courseRecordEo.getCr_sid() == sid)
				list.add(courseRecordEo);
		}
		// em.clear();
		List<CourseRecord> reList = new ArrayList<CourseRecord>();
		CourseEo ce;
		for (CourseRecordEo cre : list) {
			ce = (CourseEo) em.find(CourseEo.class, cre.getCr_cid());
			reList.add(new CourseRecord(cre, ce.getCname()));
		}
		return reList;
	}
	// public List<CourseRecord> getCourseRecords(int sid) {
	// // TODO Auto-generated method stub
	// List<CourseRecord> reList=new ArrayList<CourseRecord>();
	// Connection connection=daoHelper.getConnection();
	// try {
	// Statement statement=(Statement)connection.createStatement();
	// String sql=
	// "select cr.cid, c.cname, cr.score "+
	// "from courseRecords cr, courses c "+
	// "where cr.sid="+sid+" and cr.cid=c.cid";
	// ResultSet resultSet=statement.executeQuery(sql);
	// while(resultSet.next()){
	// reList.add(new CourseRecord(resultSet.getInt(1), resultSet.getString(2),
	// resultSet.getInt(3)));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return reList;
	// }
}
