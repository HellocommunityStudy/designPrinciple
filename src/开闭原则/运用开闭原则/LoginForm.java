package 开闭原则.运用开闭原则;

public class LoginForm {

	private AbstractButton button;
	
	public void display() {
		// TODO Auto-generated method stub
        button.display();
	}

	public AbstractButton getButton() {
		return button;
	}

	public void setButton(AbstractButton button) {
		this.button = button;
	}
	
	
}
