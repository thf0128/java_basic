package basic.loop;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
        - ���� 3���� �Է� �޽��ϴ�.
        - ���� ū ��, ���� ���� ��, �߰����� ���ؼ� ����� ������.

        # max, mid, min�̶�� ������ �̸� �����ϼż�
         �Ǻ��� �� ������ ������ ������ ���� �־��ݴϴ�.
         �������� �ѹ��� ����Ͻø� �ǰڽ��ϴ�.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("���� 1: ");
		int num1 = sc.nextInt();
		System.out.print("���� 2: ");
		int num2 = sc.nextInt();
		System.out.print("���� 3: ");
		int num3 = sc.nextInt();

		int max, mid, min;

		if(num1 > num2 && num1 > num3) { // num1�� max��!
			max = num1;
			if(num2 > num3) {
				mid = num2; min = num3;
			}else {
				mid = num3; min = num2;

			}
		}else if(num2 > num1 && num2 > num3) { //num2�� max��!
			max = num2;
			if(num1 > num3) {
				mid = num1; min = num3;
			}else
				mid = num3; min = num1;
				
		}


	else { //num3�� max��!
		max = num3;
		if(num1 > num2) {
			mid = num1; min = num2;
		}else {
			mid = num2; min = num1;
		}
		
	}
		System.out.println("---------------------");
		System.out.println("�ִ� :" + max);
		System.out.println("�ּڰ� :" + min);
		System.out.println("�߰��� :" + mid);
	
}
}
