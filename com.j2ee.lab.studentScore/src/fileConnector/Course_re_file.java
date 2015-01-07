package fileConnector;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.j2ee.ejbServer.po.CourseRecord;

import dataService.CourseRecordDAO;

public class Course_re_file implements CourseRecordDAO {

	private List<CourseRecord> cr_list;
	
	public Course_re_file(){
		String path = RootPath.get() + "/filedata/course_re.txt";
		BufferedReader reader = null;
		cr_list=new ArrayList<CourseRecord>();
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
			String line = reader.readLine();
			int cid;
			String name;
			int score;
			int sid;
			while (line != null) {
				String[] infos=line.split(";");
				cid=Integer.valueOf(infos[0]);
				name=infos[1];
				score=Integer.valueOf(infos[2]);
				sid=Integer.valueOf(infos[3]);
//				CourseRecord(int cid, String cname, int score)
				cr_list.add(new CourseRecord(cid, name, score,sid));
				line = reader.readLine();
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
	
	@Override
	public List<CourseRecord> getCourseRecords(int sid) {
		// TODO Auto-generated method stub
		List<CourseRecord> re_list=new ArrayList<CourseRecord>();
		for(CourseRecord cr: cr_list){
			if(cr.getSid()==sid){
				re_list.add(cr);
			}
		}
		return re_list;
	}

}
