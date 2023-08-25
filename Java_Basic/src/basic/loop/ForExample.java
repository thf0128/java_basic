package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		*/
		//for���� �ݺ�Ƚ���� ��Ȯ�Ҷ� ���� ��� 
		//while���� �ݺ�Ƚ���� ��Ȯ���� ������ ���� ��� (ex ���ѷ���)
		int total = 0; //�����Լ� ����� �������� ����
		for(int i=1; i<=10; i++) {
			total += i;
		}
		
		// 1~200������ ���� �� 6�� ����̸鼭 12�� ����� �ƴ� ����
		// ���η� ����� ������.(for)
		
		for(int i=1; i<=200; i++) {
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1~ 60000������ ���� �� 177�� ����� ������ ���غ�����. (for)
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				count++;
			}
		}
		System.out.println("1~60000�� 177�� ����� ����: " + count + "��");
		
		//������ �ϳ� �Է¹޾Ƽ� �Է¹��� ����������
		//���丮�� ���� ���ϼ���.
		//���丮��) 5! -> 5 x 4 x 3 x 2 x 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		
		int fac = 1; // ���丮�� ���� ���� ���� ����
//		for(int i=1; i<=num; i++) {
//			fac *= i;
//		}
		
		for(int i=num; i >= 1; i--) {
			fac *= i;
		}
		System.out.printf("%d! = %d\n", num, fac);
		sc.close();
	}
}
