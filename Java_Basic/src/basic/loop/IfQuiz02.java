package basic.loop;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

		/*
        # ��ĳ�ʸ� ����Ͽ� ������ �ϳ� �Է¹�������.
        
        - �Է¹��� ���� 7�� ������ "7�� ����Դϴ�." �� ���.
        - �Է¹��� ���� 7�� ����� �ƴ϶�� "7�� ����� �ƴմϴ�." �� ���.
        - �Է¹��� ���� 0�̶�� "0�Դϴ�." �� ����ϼ���.
       */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("7�� ����ϱ�? ");
		int n = sc.nextInt();
		
		if(n % 7 == 0) {
			if(n == 0) {
				System.out.println("0�Դϴ�.");	
			}else {
				System.out.println("7�� ����Դϴ�.");
			}
		}else if(n % 7 != 0) {
			System.out.println("7�� ����� �ƴմϴ�.");
		}
		sc.close();
	}

}
