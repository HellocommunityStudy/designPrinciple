package �ϳɸ���ԭ��.���úϳɸ���ԭ��;

public class TeacherDao {
	private DBUtil dbUtil;

	//�����������ע��͸������,����
	public void setDbUtil(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}
	
	public TeacherDao findTeacherByid(String id){
		dbUtil.getConnection();
		return null;
		
	}
	
	

}
