package dbConnnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import data.Student;
import dataService.StudentInfoDAO;

public class Student_db  implements StudentInfoDAO{

	
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Student stu=null;
		Connection connection=Dbconnect.getConnection();
		try {
			Statement statement=(Statement)connection.createStatement();
			String sql="select * from students where sid="+sid;
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()){
				 stu=new Student(sid, resultSet.getString(2), resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
}
