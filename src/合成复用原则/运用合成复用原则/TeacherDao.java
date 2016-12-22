package 合成复用原则.运用合成复用原则;

public class TeacherDao {
	private DBUtil dbUtil;

	//这样的情况下注入就更加灵活,可以
	public void setDbUtil(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}
	
	public TeacherDao findTeacherByid(String id){
		dbUtil.getConnection();
		return null;
		
	}
	
	

}
