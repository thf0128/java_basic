package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("��ö��", 32, "����");
//		Person lee = new Person("�̿���", 25, "����");
//		Person park = new Person("�ڻǻ�", 50, "����");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("��ö��", 32, "����");
		
//		int[] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("��ö��", 32, "����"),
				new Person("�̿���", 25, "����"),
				new Person("�ڻǻ�", 50, "����")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
	}
}
