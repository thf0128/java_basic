package oop.obj_arr;

public class Score {

	public static void main(String[] args) {
		
		
	}

	/*
    - �̸�, ����, ����, ����, ����, ���(double)��
     ���� �� �ִ� ��ü�� �������ϼ���.
     
    - �л��� ��� ������ �� ���� Ȯ���� �� �ְ�
     scoreInfo() �޼��带 ������ �ּ���.
     �޼��� ���ο��� ��¹��� �̿��ؼ� ��� ������ ����� �ּ���.
     
    - ĸ��ȭ�� �����ؼ� �ۼ��� �ּ���. (�����ڴ� ����� �ϼ���.)
   */
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;

	public Score() {}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total / 3.0;
	}
	
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public void scoreInfo() {
		System.out.printf("�̸�: %s ����: %d�� ����: %d�� ����: %d��\n����: %d�� ���: %.2f��\n"
				, name, kor, eng, math, total, average);
	}
	
	
	
	
}
