package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48~150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복
		
//		int n = 48;
//		
//		while(n <= 150) {
//			if(n % 8 == 0) {
//				System.out.println(n + " ");		
//			}
//			n++;
//		}
		
		int n = 48;
		while(n <= 150) {
			System.out.println(n + " ");
			n += 8;
		}
		
		System.out.println(); // 단순 줄 개행
		
		
		// 1 ~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int i = 1;
		
		while(i <= 100) {
			if(i % 4 == 0 && i % 8 != 0) {
				System.out.println(i + " ");
		}
			i++;
		}
		System.out.println("---------");
		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력
		int t = 1;
		int count = 0; // 배수의 개수를 세 줄 변수.
		
		while(t <= 30000) {
			if(t % 258 == 0) {
				count++;
			}
			t++;
		}
		
		System.out.println("1 ~ 30000중 258의 배수의 개수: " + count + "개");
	
		//1000의 약수의 개수를 구하세요.
		int z = 1;
		int cou = 0;
		while(z <= 1000) {
			if(1000 % z == 0) {
				cou++;
			}
			z++;
		}
		System.out.printf("1000의 약수의 개수: %d개\n", cou);
		
	}

}
