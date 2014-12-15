package data;

public class CourseRecord {
	private String cname;
	private int cid;
	private int score;
	public CourseRecord(int cid, String cname, int score) {
		// TODO Auto-generated constructor stub
		this.cname=cname;
		this.cid=cid;
		this.score=score;
	}
	public boolean isPass(){
		return 60<=score;
	}
	public int getCid(){
		return cid;
	}
	public String getCname(){
		return cname;
	}
	public int getScore(){
		return score;
	}
	public String toString(){
		return ""+cid+"\t"+cname+"\t"+score;
	}
}
