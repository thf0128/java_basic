package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 - ũ�Ⱑ ���� ������ Ÿ���� �ڷḦ ū ������ Ÿ������ ��ȯ�� ����
		 �ڹ� ���� �ӽ� (JVM)�� �ڵ����� Ÿ���� �÷��� ��ȯ�� �ݴϴ�.
		 (promotion, UpCasting)
		 */
		
		byte b = 10;
		int i = b; // byte -> int�� ��ȯ�� �� ���� ���� ����.
		System.out.println(i);
		
		char c = '�P';
		int j = c; 
		System.out.println("�P�� ���� ��ȣ: " + j);
		// int�� �� ������ ũ�Ƿ� A��� ���Ϲ��ڰ� int�� �ڵ� ����ȯ�̵�
		
		int k = 500;
		double d = k;
		System.out.println(d);
		// int�� double�� ����÷��� �ڵ� ����ȯ 
		
		}
	
}
