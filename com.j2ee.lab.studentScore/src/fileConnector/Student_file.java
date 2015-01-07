package fileConnector;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.j2ee.ejbServer.po.Student;

import dataService.StudentInfoDAO;

public class Student_file implements StudentInfoDAO {

	public Student_file() {
		String path = RootPath.get() + "/filedata/stu_info.txt";
		BufferedReader reader = null;
		stu_list=new ArrayList<Student>();
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
			String line;
			int sid;
			String name;
			String pw;
			while ((line = reader.readLine()) != null) {
				String[] infos=line.split(";");
				sid=Integer.valueOf(infos[0]);
				name=infos[1];
				pw=infos[2];
				stu_list.add(new Student(sid, name, pw));
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<Student> stu_list;

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		for(Student stu: stu_list){
			if(stu.getSid()==sid){
				return stu;
			}
		}
		return null;
	}
}
