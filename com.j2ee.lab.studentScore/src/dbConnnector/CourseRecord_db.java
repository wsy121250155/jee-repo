package dbConnnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.CourseRecord;
import dataService.Cr_source_service;

public class CourseRecord_db  implements Cr_source_service{
		
	public List<CourseRecord> getCourseRecords(int sid) {
		// TODO Auto-generated method stub
		List<CourseRecord> reList=new ArrayList<CourseRecord>();
		Connection connection=new Dbconnect().getConnection();
		try {
			Statement statement=(Statement)connection.createStatement();
			String sql=
					"select cr.cid, c.cname, cr.score "+
					"from courseRecords cr, courses c "+
					"where cr.sid="+sid+" and cr.cid=c.cid";
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()){
				 reList.add(new CourseRecord(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reList;
	}

}
