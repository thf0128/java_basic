package etc.exception.basic;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		for(int i=0; i<=pets.length; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다");
			} catch(Exception e) {
				System.out.println("애완동물 정보없음");
			} finally {
				System.out.println("마지막에 아무튼 실행되는 문장");
			}
		}
		
		
	}

}
