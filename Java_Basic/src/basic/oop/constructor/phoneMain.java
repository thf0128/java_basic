package oop.constructor;

public class phoneMain {

	public static void main(String[] args) {
		
	phone basic	= new phone();
	basic.showSpec();	
	
	phone basic2 = new phone();
	basic2.showSpec();
	
	System.out.println("-----------------------------------------------");
	
	phone galaxy = new phone("갤럭시 s23");
	galaxy.showSpec();
	
	phone iphone14 = new phone("아이폰 14", "스페이스 그레이");
	iphone14.showSpec();
	
	
	
	
	}
}
