package oop.poly.car;

public class Tesla extends Car {

	@Override
	void run() {
		System.out.println("�׽��� �޸��ϴ�~");
	}
	
	void activeAutopilot() {
		System.out.println("�׽����� �������Ϸ��� �����ϴ�!");
	}
}