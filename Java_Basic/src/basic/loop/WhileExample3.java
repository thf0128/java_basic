package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 - ���� 1���� �Է¹޾Ƽ� �ش� ������ �Ҽ�(prime number)
		 ������ �Ǻ��Ͻø� �˴ϴ�. 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		int i = 1; // begin -> �Ҽ��� �Ǻ��� ���ؼ� �Է¹��� ���� num�� ���������� ������ �� ����
		int count = 0; // ������ ������ Ƚ���� ����� ����.
		
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count == 2) {
			System.out.println(num + "��(��) �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
		}
		
		System.out.println("==============================");
		
		int j = 2; // begin
		
		while(num % j != 0) {
			j++; //step
		}
		
		System.out.printf("%d��(��) %s.\n", num, (num == j ? "�Ҽ��Դϴ�" : "�Ҽ��� �ƴմϴ�"));
		
		sc.close();
	}
}
