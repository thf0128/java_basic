/**
 * 
 */
package basic.constate;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		/*
        # if�� ��ø�� 
        - else if���� ù��° ���ǽ��� false�� ��� �б⸦ �����ٸ�
         if�� ��ø���� ù��° ���ǽ��� true�� ��� �б⸦ ������ ����Դϴ�.
         
        # ������ ��� ���� (��ȿ ����)
        - ������ ����� ��� �������� ��ȿ�մϴ�.
         ����� ����� ����� �޸𸮿��� �ڵ����� �Ҹ��մϴ�.
        - ������ ������ �� ��� ������ �� �ľ��ؼ� 
         ��ü������ ����� ������� �̸� ������ �ΰ�,
         ���������� ����� ������ �� ��� ���� �������� ����ϰ�
         �Ҹ��Ű�� ���� �����ϴ�.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		int height = sc.nextInt();
		
		if(height >= 140) {
			System.out.print("���̸� �Է��ϼ���: ");
			int age = sc.nextInt();
			if(age >= 8) {
				System.out.println("���̱ⱸ ž���� �����մϴ�.");
			} else if(age >= 6){
				System.out.println("��ȣ�� ���� �� ž���� �����մϴ�.");
			} else {
				System.out.println("���̰� 6�� �̸��Դϴ�.");
				System.out.println("���̱ⱸ ž���� �Ұ����մϴ�.");
			}
				
		} else {
			System.out.println("Ű�� 140cm �̸��Դϴ�.");
			System.out.println("���̱ⱸ ž���� �Ұ����մϴ�.");
		} 
		
		sc.close();

	}

}
