package basic.loop;

public class CountinueExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue; //�̹� ȸ�� �ǳʶٱ�

			System.out.print(i + " ");
		}
		System.out.println("\n�ݺ��� ����!");


	}

}
