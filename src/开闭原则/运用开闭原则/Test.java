package ����ԭ��.���ÿ���ԭ��;

public class Test {

	public static void main(String[] args) {
		LoginForm loginForm=new LoginForm();
		AbstractButton button=new CircleButton();
		loginForm.setButton(button);
		loginForm.display();
		
		AbstractButton button2=new RecetangleButton();
		loginForm.setButton(button2);
		loginForm.display();
	}
}
