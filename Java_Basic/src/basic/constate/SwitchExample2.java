package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int point = sc.nextInt();
		
		switch(point / 10) {
		
		case 10:
			if(point > 100) {
				System.out.println("�߸��� �����Դϴ�.");
				break;
			} 
		case 9:
			System.out.println("����� ������ A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� ������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� ������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� ������ D�Դϴ�.");
			break;
			
		default:
			if(point > 100 || point < 0) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			} else {
				System.out.println("����� ������ F�Դϴ�.");
			}
		}
		
		sc.close();
		
	}

}
