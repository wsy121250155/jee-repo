package data;

import java.io.Serializable;
import java.util.List;

import com.j2ee.ejbServer.po.CourseRecord;

public class CourseRecordList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CourseRecord> crList;

	public CourseRecordList() {
	}

	public void show() {
		for (CourseRecord cr : crList) {
			System.out.println(cr);
		}
	}

	public CourseRecord getCrList(int index) {
		if (null == crList) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return crList.get(index);
	}

	public boolean isAllPass() {
		if (null == crList) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (CourseRecord cr : crList) {
			if (!cr.isPass())
				return false;
		}
		return true;
	}

	public List<CourseRecord> getCrList() {
		return crList;
	}

	public void setCrList(List<CourseRecord> crList) {
		this.crList = crList;
	}
}
