package 合成复用原则.运用合成复用原则;

public class Test {
	public static void main(String[] args) {
		DBUtil dbutil=new NewDbutil();
		StuDao stuDao=new StuDao();
		stuDao.setDbutil(dbutil);
		stuDao.findStuByid("1");
		
		DBUtil nextdbutil=new NextDbutil();
		TeacherDao teacherDao=new TeacherDao();
		teacherDao.setDbUtil(nextdbutil);
		teacherDao.findTeacherByid("1");
		
	}

}
