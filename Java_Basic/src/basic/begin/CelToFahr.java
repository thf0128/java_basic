package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
        ����ڿ��� �����µ��� �Է¹޾Ƽ�
        ȭ���µ��� ��ȯ�Ͽ� ����ϴ� ������ �ۼ��ϼ���.
        ��ȯ������ ���� �����. �����е��� ã�Ƽ� ������ �ּž� �մϴ�.
        ȭ�� �µ��� �Ҽ��� ù° �ڸ����� ǥ���� �ֽñ� �ٶ��ϴ�.
        # �� ���� 7 -> (��),   �� ���� ������ 4 -> (��)
        */
		
//		(�����µ� �� 1.8) + 32 = ȭ���µ�
		
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.print("�µ��� �Է��ϼ���(��): ");
		double cel = sc.nextDouble();
		
		double fahr = cel * 9 / 5 + 32;
		
		System.out.printf("�Է��� ����: %.1f��\n", cel);
		System.out.printf("��ȯ�� ȭ��: %.1f��\n", fahr);
		
		sc.close();
		
		
	}

}
