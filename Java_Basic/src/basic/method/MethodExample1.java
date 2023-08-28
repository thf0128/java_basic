/*
		 # �޼��� (method)
		 
		 - �޼���� �ݺ��Ǵ� �ڵ� ��Ͽ� �̸��� �ٿ����� ���Դϴ�.
		 
		 - �޼���� �ݺ��Ǵ� �ڵ带 �ٿ��ְ�
		  �� �� ����ȭ ���Ѽ� �츮�� �ڵ带 �˾ƺ��� ���� �մϴ�. (�ڵ��� ���ȭ)
		  
		 - �޼���� �����ϴ� ������ ȣ���ϴ� �������� ���������ϴ�.
		 
		 - �޼����� ������ �޼��� ���ο����� �Ұ����մϴ�. ���ο� �޼����� ������
		  �ݵ�� �޼��� ��� �ܺ� and Ŭ���� ��� ���ο����� �����մϴ�.
		  
		 - �޼����� ȣ���� �޼��峪 ������ ���ο����� �����մϴ�.
		 
		 - �޼����� ȣ���� �� �޼��带 ����ϴ� ���� �ǹ��ϸ�,
		 1. �޼��尡 �ʿ�� �ϴ� ������(�Ű���)�� ȣ��ο��� �����ϸ�
		 2. �� ���� �޾Ƽ� �޼��� ���η� �����ϰ�, ������ ����˴ϴ�.
		 3. ���� ������� �޼��带 ȣ���� ������ �ٽ� ��ȯ�մϴ�.
		 4. ��ȯ�� ���� ������ ��Ƽ� �����ϰų�, ����ϴ� �� �پ��ϰ� Ȱ���մϴ�.
		 */

package basic.method;

public class MethodExample1 {
	
	//�޼����� ����! (static�� �ڿ��� �˷��帱�Կ�. ������ ���ٰ� �����ϼ���.) 
	static int calcTotal(int x) {
		int total = 0;
		for(int i=1; i<=x; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int total = calcTotal(10); // int total = 55;
		System.out.println(total);
		
		System.out.println("1~100������ ������: " + calcTotal(100));
		System.out.println("1~200������ ������: " + calcTotal(200));
		System.out.println("1~300������ ������: " + calcTotal(300));
		System.out.println("1~400������ ������: " + calcTotal(400));
		System.out.println("1~500������ ������: " + calcTotal(500));
		System.out.println("1~600������ ������: " + calcTotal(600));
		System.out.println("1~700������ ������: " + calcTotal(700));
		
	}
}
