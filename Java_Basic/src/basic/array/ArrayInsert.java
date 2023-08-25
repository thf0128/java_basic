package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("�̸��� �Է��ϼ���: ");
			String name = sc.next();
			
			/*
            - �ڹٿ����� ���ڿ� ���� �� �� '==' �����ڸ�
             ����ϸ� ����� �񱳰� ���� �ʽ��ϴ�.
             
            - ���ڿ� String Ÿ���� �⺻ ������ Ÿ���� �ƴ�
             ��ü ���� Ÿ���̱� �����Դϴ�.
             ��ü ���� Ÿ���� �ش� ���� ���� ��� �ִ� �� �ƴ϶�
             ��ü�� �ּҰ��� ��� �ֱ� ������,
             ���ڿ��� �ƹ��� ������ �ּҰ� �ٸ��� false��
             �����մϴ�.
             
            - �׷��Ƿ� ���ڿ� ���� �񱳸� ������ ����
            [�񱳹��ڿ�1.equals(�񱳹��ڿ�2)] �� ����Ͽ�
            �����ؾ� �մϴ�.
            */
			
			if(name.equals("�׸�")) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			
			names[i] = name;
		}
		
//		System.out.println(Arrays.toString(names));// �迭�� ��� ������ ���ڿ��� ������
		
		System.out.println("----------------------------");
		System.out.print("�Է¹��� �̸�: ");
		for(String n : names) {
			if(n == null) break;
			System.out.print(n + " ");
		}
		
		
		sc.close();
	}

}
