package etc.api.lang.system;

public class SystemTime {

	public static void main(String[] args) {

		/*
        System Ŭ������ �����ϴ� currentTimeMillis()��
        1970�� 1�� 1�� ������ �������� ������� �ҿ�� �ð���
        �и��� (1/1000)�� ��ȯ�� longŸ���� ������ ��ȯ�մϴ�.
        */
		
		long start = System.currentTimeMillis();
		
		int total = 0;
		for(long i=1; i<=2000000; i++) {
			total += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("���� �ҿ�ð�: " + (end-start) * 0.001 + "��");
		
		System.out.println(System.getProperties());
		System.out.println(System.getenv());
		
	}
}
