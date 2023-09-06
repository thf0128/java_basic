package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		/*
        # ���� ó��
        - �����ڰ� �ڵ带 ���� ó���� �� �ִ� ������ �ٷ�� ��.
        - ���� ó���� �ý��� ������ ������ �����ϴ� ���� �ƴϰ�
         ���� �߻� ���ɼ��� �ִ� �κп� ���� ó���� �̸� �غ��ϴ� ���Դϴ�.
        - �ý����� �������� ���Ḧ ���� �ڵ��� �帧�� ��ӵ� �� �ֵ���
         ������ �غ��ϴ� ������ ���մϴ�. 
        */
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1: ");
		int i = sc.nextInt();
		System.out.print("����2: ");
		int j = sc.nextInt();
		
		System.out.println("������ ����!");
		
		
			//try ��Ͽ��� ���� �߻� ���ɼ��� �ִ� �ڵ带 �ۼ��մϴ�.
		
		System.out.printf("%d / %d = %d\n", i, j, i/j);
		
		sc.close();
		
		} catch(Exception e) {
			//catch ��Ͽ��� try ��Ͽ��� ���� ���ܰ� �߻����� ���
			//������ �ڵ带 �ۼ��մϴ�.
			System.out.println("0���� �����ø� ��ؿ�!");
		}
		
		
		
		System.out.println("���α׷� ���� ����!");
	}
	
}
