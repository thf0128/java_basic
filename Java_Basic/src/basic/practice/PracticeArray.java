package basic.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] kakao = {"����", "�׿�", "����ġ", "���̾�", "�����"};
		System.out.println("���� ����� ģ����: " + Arrays.toString(kakao));

		while(true) {

			if(kakao.length == 0) {
				System.out.println("���̻� ������ ģ���� ���׿�.");
				System.out.println("���α׷��� �����մϴ�.");
			}

			System.out.println("������ ���ϴ� ģ���� �Է��ϼ���: ");
			String name = sc.next();

			boolean flag = false;
			for(int i = 0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					flag = true;
					for(int j=i; j<kakao.length-1; j++) {
						kakao[j] = kakao[j+1];
					}
					break;
				}
			}
			if(!flag) {
				System.out.println(name + "(��)�� ���� �̸��Դϴ�.");
			}else {
				String[] temp = new String[kakao.length-1];
				for(int k=0; k<temp.length; k++) {
					temp[k] = kakao[k];
				}
				kakao = temp; temp = null;
				
				System.out.println("���� �� ����: " + Arrays.toString(kakao));
			}
		}

	}

}
