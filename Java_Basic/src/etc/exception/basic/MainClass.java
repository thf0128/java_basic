package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
        1. ��ĳ�ʸ� ���ؼ� ���� 2���� �Է¹޽��ϴ�.
        2. �Է¹��� ���� �������, �ܼ��� �Է¹��� ������ ���� ����ϰ�
         �ݺ����� �����Ű����.
        3. �Է¹��� ���� ������ �߻���Ű�� ���̶�� "�����θ� �Է��ϼ���"
         �� ����� �Ŀ� �ٽ� �Է¹��� �� �ֵ��� �ۼ��� �ּ���.
        4. �ݺ����� Ż���ϸ� ���α׷� ���� ���� ������ ��� �ּ���.
        
        (���� nextInt()�� ������ ������ ���� ���ϴ� ��� (���ڿ� ���)
        ���ۿ� �ش� ������ ���ڰ� �״�� ���� �ֽ��ϴ�. �װ� �Ⱦ �ּž� �մϴ�.
        nextLine()�� ���� ������ ���ڸ� �����ؾ� �մϴ�.)
		*/
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.print("����1: ");
			int num1 = sc.nextInt();
			System.out.print("����2: ");
			int num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			break;
			} catch (Exception e) {
				System.out.println("�����θ� �Է��ϼ���!");
				sc.nextLine();
			}
				
		}
		sc.close();
	}

}
