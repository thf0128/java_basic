package etc.exception.basic;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		String[] pets = {"������", "�����", "±±��"};
		
		for(int i=0; i<=pets.length; i++) {
			try {
				System.out.println(pets[i] + "Ű��� �ʹ�");
			} catch(Exception e) {
				System.out.println("�ֿϵ��� ��������");
			} finally {
				System.out.println("�������� �ƹ�ư ����Ǵ� ����");
			}
		}
		
		
	}

}
