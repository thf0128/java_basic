package basic.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

		while(true) {

			if(kakao.length == 0) {
				System.out.println("더이상 삭제할 친구가 없네요.");
				System.out.println("프로그램을 종료합니다.");
			}

			System.out.println("삭제를 원하는 친구를 입력하세요: ");
			String name = sc.next();

			boolean flag = false;
			for(int i = 0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					flag = true;
					for(int j=i; j<kakao.length-1; j++) {
						kakao[j] = kakao[j+1];
					}
					break;
				}
			}
			if(!flag) {
				System.out.println(name + "(은)는 없는 이름입니다.");
			}else {
				String[] temp = new String[kakao.length-1];
				for(int k=0; k<temp.length; k++) {
					temp[k] = kakao[k];
				}
				kakao = temp; temp = null;
				
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
			}
		}

	}

}
