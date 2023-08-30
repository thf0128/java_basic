package oop.constructor;

public class Person {

	String names;
	int ages;
	int heights;
	
	Person() {} // 기본 생성자는 하나 기본으로 깔아두는게 좋다 아무것도 기입을 안하더라두!
	
	Person(String pNames,int pAges,int pHeights){
		
		names = pNames;
		ages = pAges;
		heights = pHeights;
	}
	
	void info () {
		System.out.println("*** 정보 ***");
		System.out.println("이름: " + names);
		System.out.println("나이: " + ages);
		System.out.println("키: " + heights);
	}
	
	
	
		
	
}
