package 合成复用原则.运用合成复用原则;

public class NextDbutil extends DBUtil{
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("我是第二种连接");
	}

}
