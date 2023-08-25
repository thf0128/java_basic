package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
        - ������ �ϳ� �Է¹ް�, �����ڸ� �ϳ� �Է� ��������.
         �ٽ� ������ �Է¹޾Ƽ�, ����ڰ� ������ �����ڸ� ��������
         ���� ����� ����� �ֽø� �˴ϴ�. (switch�� ���)
         �����ڰ� �߸� �ԷµǾ��ٸ� �����ڸ� �ȹٷ� �Է��϶��
         ����� ������ �ּ���.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �����ϼ���. [+,-,*,/]");
		String operator = sc.next();
		
		System.out.print("���� 2: ");
		int num2 = sc.nextInt();
		
		int result = 0;
		boolean flag = false;
		
		switch(operator) {
		
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("������ �� ���� �Է°� �Դϴ�");
				flag = true;
				break;
			}
			result = num1 / num2;
			break;
			
			default:
				System.out.println("���� ��ȣ�� ��Ȯ�ϰ� �Է��ϼ���.");
				System.out.println("[+,-,*,/]");
		}
		
		if(!flag) {
		System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);
		}
		
		sc.close();
	}

}
