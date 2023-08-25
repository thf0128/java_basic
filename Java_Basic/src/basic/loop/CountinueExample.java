package basic.loop;

public class CountinueExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue; //이번 회차 건너뛰기

			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");


	}

}
