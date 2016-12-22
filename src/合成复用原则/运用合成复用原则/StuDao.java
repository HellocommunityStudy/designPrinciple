package 合成复用原则.运用合成复用原则;

public class StuDao {
	private DBUtil dbutil;

	public void setDbutil(DBUtil dbutil) {
		this.dbutil = dbutil;
	}
	
	public StuDao findStuByid(String id){
		dbutil.getConnection();
		return null;	
	}
}
