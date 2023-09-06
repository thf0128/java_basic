package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {

		/*
        - ��ĳ�ʸ� �̿��Ͽ� Person��ü�� �����ϴ� �� �ʿ���
         ������ �Է¹����ø� �ǰڽ��ϴ�.
         �Է¹��� ������ ���� Person��ü�� ������ ��
         ���� ���� Person ��ü�� �迭���� ��� �� �����Դϴ�.
         
        - �迭�� ũ��� 3���� �ϰڽ��ϴ�. �ݺ����� �̿��Ͽ�
         �Է��� �ݺ��ؼ� �޾��ֽø� �˴ϴ�.
         
        - �Է��� ������ �迭 �ȿ� �ִ� ��� �ּҰ��� ��ȸ�Ͽ�
         �� ��ü�� personInfo()�� ȣ���� ������. 
         ��ü ���� 3 �迭�� ũ�� 3�� �Է� �ݺ��� 3��Ʈ
         �ݺ����� ������ ��� �ּҰ��� ��ȸ�ؼ� �� personInfo ���
        */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			System.out.print("����: ");
			String gender = sc.next();
			
//			Person p = new Person(name, age, gender);
//			people[i] = p;
			people[i] = new Person(name, age, gender);
			
			System.out.println("*** ���� �Է� �Ϸ� ***\n");
		} // �Է¹޴� �ݺ��� ��.
		
		System.out.println("--------------------------");
		
		for(Person p : people) {
			p.personInfo();
		}
		
		sc.close();
			
	}

}
