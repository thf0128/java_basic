package oop.poly.car;

public class Driver {

	public void drive(Car c) {
		System.out.println("������ �����մϴ�.");
		c.run();
	}

	public Car buyCar(String name) {
		if(name.equals("�ҳ�Ÿ")) {
			System.out.println("�ҳ�Ÿ�� �����մϴ�.");
			return new Sonata();
		} else if(name.equals("������")) {
			System.out.println(" �������� �����մϴ�.");
		} else if(name.equals("�׽���")) {
			System.out.println(" �׽��� �����մϴ�.");
			return new Tesla();
		}else {
			System.out.println("���޶��~~");
			return null;
		}
		return null;
	}
}
