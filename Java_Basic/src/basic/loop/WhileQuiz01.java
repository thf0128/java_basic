package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
        # ����ڿ��� ������ �ܼ��� �Է¹޾Ƽ�
        �ش� �ܼ��� �������� ����� ������.
        ex)
        
        �������� �Է��ϼ���: 4
        *** ������ 4 �� ***
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16 
        .
        .
        .
        4 x 9 = 36
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		int dan = sc.nextInt();
		System.out.println("*** ������ " + dan + "�� ***");
	
		int hang = 1;
		while(hang <= 9) {
			System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			hang++;
		}
		
		sc.close();
	}

}
