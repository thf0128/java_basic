package basic.array;

import java.util.Arrays;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79, 80, 99}, //A�л�
				{95, 85, 89}, //B�л�
				{90, 65, 56}, //C�л�
				{69, 78, 77}  //D�л�
				//����: 3����
		};

		String[] stuName = {"A�л�", "B�л�", "C�л�", "D�л�"};
		String[] subName = {"����", "����", "����"};


		/*
        1. �� �л��� ����� �Ҽ��� ù° �ڸ����� ����� ������.
        2. �� ������ ����� ����� ������.
        3. �� ����� ����� ������. (��� �л����� ����� ���ؼ� �л����� ������)
		 */
		
		double totalAvg = 0.0; // �л����� ��������� ����.
		int idx = 0; // stuName �迭���� �л��� �̸��� ������ �뵵�� ����� ����
		for(int[] stu : score) {
			int total = 0;
			for(int s : stu) {
				total += s;
			}
			double avg = (double)total / subName.length;
			totalAvg += avg;
			System.out.printf("%s�� ���: %.1f��\n", stuName[idx], avg);
			idx++;
		}
		
		System.out.println("-----------------------------------");
		
		//2��
		for(int i=0; i<subName.length; i++) {
			int total = 0;
			for(int j=0; j<stuName.length; j++) {
				total += score[j][i];
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s�� ���������: %.1f��\n", subName[i], avg);
		}
		
		System.out.println("-----------------------------------");
		//3��
		double classAvg = totalAvg / stuName.length;
		System.out.printf("�츮�� ���: %.1f\n", classAvg);
		
	}

}
