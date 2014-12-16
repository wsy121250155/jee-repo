package fileConnector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import data.Student;
import dataService.Stu_source_service;

public class Student_file implements Stu_source_service {

	public Student_file() {
		String path = RootPath.get() + "/stu_info.txt";
		BufferedReader reader = null;
		stu_list=new ArrayList<Student>();
		try {
			reader = new BufferedReader(new FileReader(path));
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
			if(stu.getId()==sid){
				return stu;
			}
		}
		return null;
	}
}
