package �ϳɸ���ԭ��.���úϳɸ���ԭ��;

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
