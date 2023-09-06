package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		/*
        - Score ��ü�� ���� �� �ִ� �迭�� �����ϼ���.
         �迭�� ũ��� �˳��ϰ� 100���� �ϰڽ��ϴ�.
         
        - �ݺ����� �̿��ؼ� ����ڿ��� �̸�, ����, ����, ����������
        �Է¹��� ��, �Է¹��� ������ ���� Score ��ü�� �����ϼ���.
        ������ ����� �����е��� ���� ���ؼ� �����ž� �մϴ�.
        (���� �����õ�, �޼��带 �ϳ� ���� ����Ͻõ� �������~)
        ��ü ���� ��, �̸� ����� ���� �迭�� ��ü�� �߰��� �ּ���.
        �̸� �Է¶��� '�׸�' �̶�� �Է��ϸ� �ݺ����� ������� �ּ���.
        
        - �ݺ����� ����Ǿ��ٸ�, �迭 ���ο� �ִ� ��ü���� ��ȸ�ϸ鼭
         scoreInfo()�� ��� �ҷ��ּ���. (�ݺ���)
         ����!) �Է��� �߰��� �׸��ξ����ٸ�, �迭�� ������ �ε�����
         ��� null�� ���� �� �ֽ��ϴ�. (null.scoreInfo() -> ����)
        */
		
		Score[] scores = new Score[100];
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<scores.length; i++) {
			System.out.println("*** �л� ���� �Է� ���α׷� ***");
			System.out.println("'�׸�'�� �Է��Ͻø� ����˴ϴ�.");

			System.out.print("�̸�: ");
			String name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			
			System.out.print("����: ");
			int kor = sc.nextInt();
			System.out.print("����: ");
			int eng = sc.nextInt();
			System.out.print("����: ");
			int math = sc.nextInt();
			
			/*
			int total = kor + eng + math;
			double avg = total / 3.0;
			
			scores[i] = new Score(name, kor, eng, math, total, avg)
			*/
			
			scores[i] = new Score(name, kor, eng, math);
			
			System.out.println("*** �Է� �Ϸ�! ***\n");
		} // �Է� �ݺ��� ��.
		
		for(Score s : scores) {
			if(s == null) break;
			s.scoreInfo();
			System.out.println("-------------------------");
		}
		sc.close();
	}
}
