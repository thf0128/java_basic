package oop.abs.quiz;

public class MainClass {
	public static void main(String[] args) {
		
		Shape r = new Rect("���簢��", 5);
		System.out.println("������ �̸�: " + r.getName());
		System.out.println("����: " + r.getArea());
		
		System.out.println("============================");
		
		Shape c = new Circle("��", 4);
		System.out.println(c.getName());
		System.out.printf("����: %.2f", c.getArea());
		
	}
}
