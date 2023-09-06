package oop.inter.good;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//������ ������ ���� �������̽� Ÿ���� ������ �ϳ� ����.
		IUserService sv;
		
		System.out.println("�����Ͻ� ��ȣ�� �Է��ϼ���");
		System.out.println("1. ����  2. �α���  3. ��������  4. Ż��");
		System.out.print("> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			sv = new Join();
			sv.execute();
		}else if(menu == 2) {
			sv = new Login();
			sv.execute();
		}else if(menu == 3) {
			sv = new Update();
			sv.execute();
		}else if(menu == 4) {
			sv = new Delete();
			sv.execute();
		}
		sc.close();
	}

}
