package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		//�������� �����ؼ� �������� �迭�� ������ �� �ִ�.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}
		System.out.println("---------------------------");
		
		System.out.println("*** Ÿ�̾� ��ü �۾�! ***");
		t1.frontLeft = new HTire();
		t1.frontRight = new HTire();
		t1.rearLeft = new HTire();
		t1.rearRight = new HTire();
		
		System.out.println("-----------------------------");
	
		Driver kim = new Driver();
		kim.drive(s2);
		kim.drive(t3);
		kim.drive(p1);
		
		System.out.println("-----------------------------");
		
		Tesla myTesla = (Tesla) kim.buyCar("�׽���");
//		c.run();
//		Tesla myTesla = (Tesla) c;
		myTesla.activeAutopilot();
		
		
	}
}
