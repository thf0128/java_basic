package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"����", "����", "����", "�ܹ���"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "ġŲ";
		foods[2] = "������";
		System.out.println(Arrays.toString(foods));

		System.out.println("-----------------------");

		//�迭�� �ε��� Ž��
		Scanner sc = new Scanner(System.in);
		System.out.print("Ž���� ������ �Է��ϼ���: ");
		String name = sc.next();

		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("Ž�� �Ϸ�!");
				System.out.println("�ε���: " + i + "��");
				flag = true;

				break;
			} 

		}
		if(!flag) {
			System.out.println("������ �����ϴ�.");
		}
		sc.close();
	}

}
