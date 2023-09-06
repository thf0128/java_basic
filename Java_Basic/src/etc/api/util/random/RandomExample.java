package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//�Ǽ� ����: 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//���� ����: nextInt();
		int i = r.nextInt(); //�⺻����: int�� ������
		System.out.println(i);
		
		//0 ~ 5������ ���� ���� ���� (������ �̸����� �νĵ�)
		int j = r.nextInt(6);
		System.out.println(j);
		
		//10 ~ 100������ ���� ���� ����
		int k = r.nextInt(91) + 10;
		System.out.println(k);
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
	}
	
}
