package etc.exception.custom;

public class LoginValidateException extends Exception {
	
	//�⺻ ������
	public LoginValidateException() {
	
	}
	//Ŀ���� ���� �޼����� �޴� ������.
	public LoginValidateException(String message) {
		super(message);
		
	}
}
