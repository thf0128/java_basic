package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
        - ũ�Ⱑ ū ������ Ÿ���� ���� ���� ������ Ÿ������ ��ȯ�Ϸ���
         �ݵ�� �� ��ȯ ������: (type)�� ����Ͽ� ���������
         �� ��ȯ�� ������ �ּž� �մϴ�. (DownCasting)
         
        - ��������� �� ��ȯ�� �ؾ� �ϴ� ������, DownCasting�� ���
         ���� ������ �پ��� ������ �ս��� ���ɼ��� �׻� �����ϱ� �����Դϴ�.
         (overflow, underflow)
        */

		int i = 72;
		char c = (char) i;
		System.out.println("72�� ���ڰ�: " + c);
		
		double d = 4.98765;
		int j = (int) d;
		System.out.println("�����е��� �̹� �� ����: " + j*1000000);
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);

	}

}
