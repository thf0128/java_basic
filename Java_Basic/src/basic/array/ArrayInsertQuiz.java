package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {

		/*
        1. String �迭�� �����ϼ���. (foods)
        ũ��� �˳��ϰ� 50���� �����ϰڽ��ϴ�.

        2. ����ڿ��� ���� �̸��� �Է¹޾Ƽ� �迭��
         ������ �ּ���.
         ����ڰ� ���� �Է�â�� '��ҷ�' ��� �ۼ��ϸ�
         �Է��� ������ �ּ���.

        3. �Է��� ����Ǹ� ����ڰ� �Է��� ������
        ���η� ����� �ּ���. (null�� ������� ������.)

         �߰� ���� 
        - �Է��� �޾Ҵµ� �̹� �迭�� �����ϴ� �����̶��
        '�̹� �����ϴ� �����Դϴ�.' �� ����ϰ�
        �ٽ� ���ο� ������ �Է¹��� �� �ֵ��� �ڵ带 ������ ������.

		 */


		String[] foods = new String[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("�԰� ���� ������ �Է��ϼ���. ");
		System.out.println("'��ҷ�' �� �Է��Ͻø� ����˴ϴ�. ");

		outer: for(int i=0; i<foods.length; i++) {

			System.out.print("> ");
			String name = sc.next();

			if(name.equals("��ҷ�")) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}

			for(String f : foods) {
				if(name.equals(f)) {
					System.out.println("�̹� �����ϴ� �����Դϴ�.");
					i--;
					continue outer;
				}
			}

			foods[i] = name;
		}
		System.out.println("----------------");
		System.out.print("���� �԰� ���� ���ĵ�: ");


		for(String f : foods) {
			if(f == null) break;
			System.out.print(f+ " ");
		}
		System.out.println(Arrays.toString(foods));

		sc.close();
	}

}
