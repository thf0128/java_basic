package basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���. (M/F)");
		System.out.print("> ");
		String gender = sc.next();
		
		switch(gender) {
		
		/*
        switch ��ȣ �ȿ� �����Ͻ� ���ذ��� ���� 
        �����ϴ� case���� ������� Ž���մϴ�.
        ������ case�� �����ϴ� ��쿡�� �ش� case��
        ���ӵ� ������ �����մϴ�.
        ���� ��ġ�� ���ٸ� ������ ���̽����� ���������� ����˴ϴ�.
        */
		
		case "��": case "m": case "M":
			System.out.println("�����Դϴ�.");
			break; // �ش� ���̽��� �����ϰ� switch���� �����ض�! break�ڵ尡 ������ �ڵ尡 �귯����
			
		
		case "F": case "f": case "��":
			System.out.println("�����Դϴ�.");
			break;
			
		default: //case�� �������� ���� ������ ��� default�� �����ϴ�.
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		sc.close();
		
	}

}
