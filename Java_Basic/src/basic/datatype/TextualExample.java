package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; // char�� ���Ϲ��� String�� ���ڿ�
		System.out.println(c1);
		
		char c2 = 44032;
		System.out.println(c2);
		
		/*
        # ���ڿ��� ������ �� �ִ� ������ Ÿ�� String
        - �����ϰ� ���� ���ڿ��� �����ǥ("")�� ��� �����մϴ�.
        - String�� �⺻ ������ Ÿ���� �ƴ����� ���� ���̱� ������
        �⺻ ������ Ÿ��ó�� ����մϴ�. (����� ��ü Ÿ��)
        */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//�ڹٿ����� ���ڿ��� ���� ������ �����Ѵ�.
		//���� ����δ� ���ڿ��� �����ؼ� ������ ����� ����˴ϴ�.
		System.out.println(s1 + s2);
		
		//���ڿ��� �ٸ� ������ Ÿ�� ���� ����
		//����� ������ ���ڿ��� ���� ����� �����ϴ�.
		System.out.println("=============================");
		
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		System.out.println(100 + "100");
		System.out.println(3.14 + "hi");
		
		int month = 10;
		int day = 13;
		
		//�� ������ 10�� 13�� �Դϴ�.
		
		System.out.println("�� ������ " + month + "�� " + day + "�� �Դϴ�.");
		
	}

}
