package etc.exception.custom;

public class LoginUser {

	String userAccount; //������
	String userPassword; //���Խ� ������ �н�����

	//��ü�� ������ �� ������ �н����尡 ������.
	public LoginUser(String userAccount, String userPassword) {
		super();
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}

	//�α��� ����
	public String loginValidate(String inputAccount, String inputPassword) 
			throws LoginValidateException{

		//�������� ��ġ�ϴ°�?
		if(userAccount.equals(inputAccount)) {
			//�н����尡 ��ġ�ϴ°�?
			if(userPassword.equals(inputPassword)) {
				// �α��� ����
				return "SUCCESS";
			} else {
				//�н����尡 Ʋ��
				throw new LoginValidateException("��й�ȣ �ȹٷ� ġ����!");
			}
		} else {
			//���������� Ʋ��
			throw new LoginValidateException("ȸ�����Ժ��� �ϼ���!");
		}

	}
}
