package data;

import java.io.Serializable;
import java.util.List;

import com.j2ee.ejbServer.po.Course;

public class CourseList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Course> courseList;

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public Course getCourse(int i){
		if(courseList==null || i>=courseList.size()){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return courseList.get(i);
	}
}
