package basic.constate;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("�����Դϴ�.");
		} else if(age >= 17) {
			System.out.println("����л��Դϴ�.");
		} else if(age >= 14) {
			System.out.println("���л��Դϴ�.");
		} else if(age >= 8) {
			System.out.println("�ʵ��л��Դϴ�.");
		} else {
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		
		sc.close();
		
	}

}
