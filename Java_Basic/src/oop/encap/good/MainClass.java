package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
		//my.year = 1992; (x)
		my.setYear(1997);
		my.setMonth(1);
		my.setDay(28);
		
		System.out.printf("�� ������ %d�� %d�� %d�� �Դϴ�.\n"
				, my.getYear("aaa1111!"), my.getMonth(), my.getDay());
		
	}

}
