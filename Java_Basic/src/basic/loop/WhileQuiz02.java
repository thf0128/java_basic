package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
        1. ������ �ΰ� �Է¹�������. (x, y)
        2. x���� y������ �����հ踦 while�� ����Ͽ� ���ϴ� �ڵ带 �ۼ��ϼ���.
        ex) �Է�: 3, 7 -> "3���� 7������ �����հ�: 25"
        
        ó������ x�� ������ ���� ���� ���� ���̶�� �����ϰ� �ۼ��ϰڽ��ϴ�.
        �� �Ͻ� ���� ���� x�� ū ���� ������ ��쿡��
        ��� ��ó�� �� ������ ������.
        (x�� ū ���� ���͵� ���������� ����� �Ǿ����� ���ڽ��ϴ�.
        �Է�: 7, 3 -> "3���� 7������ �����հ�: 25")
        - while���� if else �� ������ �ι� ���� ���� �����ϰڽ��ϴ�.
       */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("����1: ");
	int num1 = sc.nextInt();
	System.out.print("����2: ");
	int num2 = sc.nextInt();
	/*
	if(num1 > num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	int n = num1;
	*/
	
	int start = (num1 > num2 ? num2 : num1);
	int end = (num1 > num2 ? num1 : num2);
	
	int total = 0;
	while(start <= end) {
		total += start;
		start++;
	}
		
	System.out.printf("%d���� %d������ �����հ�: %d\n", num1, num2, total);
	
	sc.close();
		
	}

}
