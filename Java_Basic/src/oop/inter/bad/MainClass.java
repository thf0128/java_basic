package oop.inter.bad;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Ͻ� ��ȣ�� �Է��ϼ���");
		System.out.println("1. ����  2. �α���  3. ��������  4. Ż��");
		System.out.print("> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			Join j = new Join();
			j.join();
		}else if(menu == 2) {
			Login log = new Login();
			log.login();
		}else if(menu == 3) {
			Update update = new Update();
			update.update();
		}else if(menu == 4) {
			Delete delete = new Delete();
			delete.delete();
		}
		sc.close();
	}

}
