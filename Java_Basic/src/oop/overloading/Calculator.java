package oop.overloading;

public class Calculator {

	/*
    # �����ε� (�ߺ�): �ϳ��� Ŭ���� ���ο��� ���� �̸��� ���� �޼��峪
     �����ڸ� ���� �� �ߺ��ؼ� ������ �� �ְ� ���ִ� ����.
     
    - �����ε� ���� ����:
    1. �Ű� ������ ������ Ÿ���� �ٸ� ��! or
    2. �Ű� ������ ���� ������ �ٸ� ��! or
    3. �Ű� ������ ������ �ٸ� ��.
    */
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}

	//void inputData(int b, int a) {} (x)
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double a, int a1) {}
	
	
	//void inputData(int number) {} (x) ���� �Ű��� 1���� �޴� �޼��尡 �̹� �����.
	
	//int inputData(int number) {
	//	return 0;
	//} (x) ��ȯ ���� (return type)�� �����ε��� ������ ��ġ�� ���մϴ�.
	
	int calcRectArea(int r) {
		return r * r;
	}
	
	int calcRectArea(int width, int height) {
		return width * height;
	}
	
	double calcRectArea(int ceil, int floor, int height) {
		return (ceil + floor) * height / 2.0;
	}
	
	
}
