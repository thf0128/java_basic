package basic.loop;

import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {

		/*
        # ���� ����
        
        - ���� ������ �ݺ� Ƚ���� ������ �ʰ� �����ϰ� �ݺ�����
         �����ϴ� �����Դϴ�.
         
        - ó�� �ݺ����� ������ ��, �����ڰ� ������ ��Ȯ�� �ݺ� Ƚ����
         �ľ��� �� ���ٸ�, ���ѷ����� �ϴ� ������ �ΰ�
         Ư�� ������ ���� ������ �� �ֵ��� �ڵ带 �����մϴ�.
         
        - �Ϲ������� ��Ȯ�� �ݺ� Ƚ���� �˰� �ִٸ� for���� ����ϰ�,
         ��Ȯ�� �ݺ� Ƚ���� �𸥴ٸ� while�� ���� ���� ������ �����Ͽ�
         ����մϴ�. while(true), for(;;) 
         for�����δ� ���� ���� �������� ���� while �����θ�
        */
		
		int i = 1;
		
		while(true) {
			if(i > 10) break;
			
			System.out.println("�ȳ��ϼ���" + i);
			i++;
		}
		
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("15 x 6 = ?");
			System.out.println("������ �𸣽ø� 0�� �Է��ϸ� ����˴ϴ�.");
			System.out.println("> ");
			int answer = sc.nextInt();
			
			if(answer == 90) {
				System.out.println("�����Դϴ�!");
				break;
			}else if(answer == 0) {
				System.out.println("������ 90 �̾����ϴ�~!");
				break;
			}else {
				System.out.println("Ʋ������~!");
			}
		}
		
		sc.close();
		
	}

}
