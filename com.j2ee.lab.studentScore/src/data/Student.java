package data;

public class Student {
	private int sid;
	private String sname;
	private String pw;
	public Student(int sid, String sname, String pw) {
		// TODO Auto-generated constructor stub
		this.sid=sid;
		this.sname=sname;
		this.pw=pw;
	}
	public boolean isMe(int sid, String pw){
		return sid==this.sid && this.pw.equals(pw);
	}
//	public int getId(){
//		return sid;
//	}
	public String getName(){
		return sname;
	}
//	public String getPw(){
//		return pw;
//	}
	public String toString(){
		return ""+sid+"\t"+sname+"\t"+pw;
	}
}
