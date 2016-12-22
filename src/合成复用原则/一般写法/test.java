package 合成复用原则.一般写法;

public class test {
	
	public static test obj=new test();
	
	public static int a =3;
	public static final int b=4;
	
	public test(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
		System.out.println("a="+a);
		System.out.println("b="+b);
	
	}

}
