package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		try {
			System.out.print("����: ");
			int n = sc.nextInt();

			int result = 100 / n;

			System.out.println(arr[result]);

			String s = null;
			s.equals("�޷�");
			
			/*
            - ���� catch���� ������ ������ �߻��ϸ�
             ���������� ������� catch���� �˻��ϸ鼭 �������� ������
             �θ� Ÿ���� ���ܸ� �ڽ� Ÿ���� ���ܺ��� ���� �ۼ��Ͻø� �ȵ˴ϴ�.
             
            - catch ���� ��ȣ�� ���� Ÿ���� ���� �� �ۼ��ϰ� ���� ����
             | ��ȣ�� ����Ͽ� Ÿ���� ������ �ֽø�, �ϳ��� catch �������
             ���� Ÿ���� ���ܸ� ���ÿ� ó���� �� �ֽ��ϴ�.
             (java 7�������� ������ ����)
            */

		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("�ȹٷ� �Է��ض� �Ӹ�~!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ������ ������!");
		} catch(Exception e) {
			System.out.println("�������� ���� ���� �߻�!");
			System.out.println("���� ����: " + e.getMessage());
		}

		System.out.println("���α׷� ���� ����!");
		
		sc.close();
	}
}