package basic.loop;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {


		 		/*
		         - ������ 2�� �Է¹޾Ƽ�, �� ���� �� ��� ���� ū ��
		         Ȥ�� �������� �Ǻ��Ͻø� �˴ϴ�.
		         ex)
		         �Է¹��� ��: 4, 7 -> 7�� ū �� �Դϴ�.
		         �Է¹��� ��: 10, 3 -> 10�� ū �� �Դϴ�.
		         �Է¹��� ��: 5, 5 -> ���� �� �Դϴ�.
		        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ū �� ���� �Ǻ��϶�");
		int i = sc.nextInt();
		System.out.println("���� ū �� ���� �Ǻ��϶�");
		int n = sc.nextInt();
				
		if(i>n) {
			System.out.println(i + "�� ū �� �Դϴ�.");
			
		}else if(i<n) {
			System.out.println(n + "�� ū �� �Դϴ�.");
			
		}else {
			System.out.println("���� �� �Դϴ�.");
		}
		sc.close();
		
	}

}
