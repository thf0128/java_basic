package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		// ���� Ÿ���� �ٸ� �⺻ �������� ���� �ÿ��� ������ Ÿ���� ū �ʿ�
		// ���� ���� �������� �ڵ����� �� ��ȯ�� ����� �ڿ� ������ ����˴ϴ�.
		
		int intResult = c + i;
		char charResult = (char) (c + i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k = 10;
		double d = (double) k / 4;
		System.out.println(d);
		
		//int���� ���� ũ���� ������ ������ �ڵ����� ����
		//int�� ��ȯ�Ǿ� ó���˴ϴ�. (������ �ս��� ����)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		
		
	}

}
