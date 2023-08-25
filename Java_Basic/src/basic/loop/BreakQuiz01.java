package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
        1. 2������ ������ 1~100������ ������ �߻����Ѽ� 
         ���������� ������ ������ �� ������ �Է¹�������.
         ����ڰ� 0�� �Է��ϸ� �ݺ����� Ż���Ű����.

        2. ���� ���Ŀ� ���� Ƚ���� ���� Ƚ���� ���� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		int cCount = 0;
		int iCount = 0;

		System.out.println("*** ���� ���� ***");
		System.out.println("# �����Ͻ÷��� 0�� �Է��� �ּ���");

		while(true) {

			int rn1 = (int) ((Math.random()*100) + 1);
			int rn2 = (int) ((Math.random()*100) + 1); //1~100������ ���� ���� 100��
			int num = (int) (Math.random()*2); // ��ȣ ���� ����

			int correct; // ����
			if(num == 0) {
				System.out.printf("%d + %d = ???\n", rn1, rn2);
				correct = rn1 + rn2;
			}else{
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct = rn1 - rn2;
			}

			System.out.printf("> ");
			int answer = sc.nextInt();

			if(answer == rn1 + rn2) {
				System.out.println("�����Դϴ�!");
				cCount++;
			} else if(answer == 0) {
				System.out.println("�����մϴ�.");
				break;
			}      else {
				System.out.println("Ʋ�Ƚ��ϴ�~");
				iCount++;
			}

		}

		System.out.println("----------------------------");
		System.out.println("���� Ƚ��: " + cCount + "ȸ");
		System.out.println("���� Ƚ��: " + iCount + "ȸ");
	}

}
