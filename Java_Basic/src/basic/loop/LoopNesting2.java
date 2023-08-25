package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
        - ������ �ϳ� �Է¹޾Ƽ� �ش� ���ڱ����� ��� �Ҽ���
         ���η� ����ϰ�, �� �Ҽ����� ������ ���ϴ� ������ �ۼ��մϴ�.
         
        ex)
        �Է¹��� �� -> 30
        �Ҽ�: 2 3 5 7 11 13 17 19 23 29
        �Ҽ��� ����: 10��
        
        �Ҽ��Ǻ� �ϴ·����� 123456789 �ݺ������� �����־����
       */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		int count = 0; // �Ҽ��� ������ ����� �� ����.
		
		System.out.print("�Ҽ�: ");
		for(int i=1; i<=num; i++) {
			int cnt = 0; // �Ҽ��� �Ǻ��� ���ؼ� ����� ������ �� �� ����
			for(int j=1; j<=i; j++) {
				if(i % j == 0) cnt++;
				
			}
			//�Ҽ��Ǻ��� ���� for ��
			if(cnt == 2) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n�Ҽ��� ����: " + count + "��");
		
		sc.close();
	}

}
