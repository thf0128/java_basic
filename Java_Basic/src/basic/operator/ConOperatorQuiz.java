package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		/*
        - 42 ~ 396������ ������ �߻���Ų ��
        �߻��� ������ Ȧ������ ¦�������� ���θ�
        3�� ��������� ����� ������.
        
        ex)
        �߻��� ����: XX
        3�� ������ ���: Ȧ���Դϴ�. or ¦���Դϴ�. 2�γ����� �� ������������ ¦�� �ƴϸ� Ȧ��
       */
		
		
		int rn = (int) ((Math.random()*355) + 42);
		System.out.println("�߻��� ����: " + rn);
		
//		String result = (rn % 2 == 0 ? "x�� ¦���Դϴ�." : "x�� Ȧ���Դϴ�.");
//		System.out.println("3�� ������ ���: " + result);
		System.out.println("3�� ������ ���: " 
		+ (rn % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�."));
		
	}

}
