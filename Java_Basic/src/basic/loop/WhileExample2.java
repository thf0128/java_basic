package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48~150������ ���� �� 8�� ����� ���η� ����� ������.
		//(48���� ���ڸ� �ϳ��� �÷����鼭 8�� ��� �Ǻ��� �ݺ�
		
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
		
		System.out.println(); // �ܼ� �� ����
		
		
		// 1 ~ 100������ ���� �� 4�� ����̸鼭
		// 8�� ����� �ƴ� ���� ���η� ����� ������.
		
		int i = 1;
		
		while(i <= 100) {
			if(i % 4 == 0 && i % 8 != 0) {
				System.out.println(i + " ");
		}
			i++;
		}
		System.out.println("---------");
		
		// 1~30000������ ���� �� 258�� ����� ������ ���
		int t = 1;
		int count = 0; // ����� ������ �� �� ����.
		
		while(t <= 30000) {
			if(t % 258 == 0) {
				count++;
			}
			t++;
		}
		
		System.out.println("1 ~ 30000�� 258�� ����� ����: " + count + "��");
	
		//1000�� ����� ������ ���ϼ���.
		int z = 1;
		int cou = 0;
		while(z <= 1000) {
			if(1000 % z == 0) {
				cou++;
			}
			z++;
		}
		System.out.printf("1000�� ����� ����: %d��\n", cou);
		
	}

}
