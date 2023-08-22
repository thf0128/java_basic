package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {

		/*
        # 3�� ������
        - �� ������(������ ���ϴ� ��)�� 3���� �����ڸ� ���մϴ�.
        - (���ǽ� ? ���� : ����);
        - ���ǽ��� ���Ͽ� true�� ��쿡�� ������,
         false�� ��쿡�� ������ ���� ����˴ϴ�.
        */
		
		int x = 10, y = 20;
		
		String result = (x > y ? "x�� y���� Ů�ϴ�" : "x�� y���� �۽��ϴ�.");
		System.out.println(result);
		
		//������ �߻���Ű�� �޼��� Math.random()
		//0.0�̻� 1.0 �̸��� �Ǽ� �������� ��ȯ�մϴ�.
//		double rn = Math.random();
//		System.out.println(rn);
		
		// 1~10������ ���� ������ �߻���Ű�� �;��~
		int rn = (int) ((Math.random()*10) + 1);
		System.out.println(rn);
		
		//10~100������ ���� ���� �߻�
		int rn2 =(int) ((Math.random()*91) + 10);
		System.out.println(rn2);
		
		//34 ~ 176������ ���� ���� �߻�
		int rn3 = (int) ((Math.random()*143) + 34);
		System.out.println(rn3);
	}

}
