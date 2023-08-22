package basic.begin;

public class PrintExample {

	public static void main(String[] args) {

		// �ڹ��� ǥ�� ��� ������ ũ�� 3���� �Դϴ�.
		// 1. ������ �������� �ʴ� print()
		// 2. �ڵ����� ������ ������ �ִ� println()
		
		System.out.print("�ȳ��ϼ���~!\n\n");
		System.out.println("Hello~!");
		System.out.print("byebye~~");
		System.out.println("�ȳ��� ������ �̤�");
		
		//3. ���� ���� ǥ�� ��� �Լ� printf()
		//���� ���ڸ� �̿��ؼ� ���ڿ��� �ϼ���Ų ��
		//���� ������ �� ���� �����ؼ� ����ϴ� ���
		
		/*
        # ������ ���� ���� ����
        %d: ��ȣ�� �ִ� ���� ������ (decimal)
        %f: �Ǽ� ������ (floation point)
        %s: ���ڿ� (String)
        
        # Ż�� �ڵ� (escape code) -> printf���� �����ϴ� �� �ƴϿ���.
        - �ݵ�� ����ǥ ���� ��ġ�ؾ� �մϴ�
        - ���ڿ� ������ Ư�� ����� ������ ���� �� ����ϴ� Ư�� ��ȣ�Դϴ�.
        \n: �� ���� ���
        \t: ���� ���� (�����̽� 4ĭ)
        */
		
		int month = 12;
		int day = 25;
		String anni = "ũ��������";
		
		//12�� 25���� ũ�������� �Դϴ�.
		System.out.println(month + "�� " + day + "���� " + anni + " �Դϴ�.");
		System.out.printf("%d�� %d���� %s �Դϴ�.\n", month, day, anni);

		//�Ǽ��� ǥ���ϴ� ���Ĺ��� %f -> �⺻ 6�ڸ����� ǥ��.
        //%.[�ڸ����� �����ϴ� ����]f -> ���ϴ� �ڸ������� ǥ��.
        //%��� ���� ��ü�� ǥ���� ���� %% ���ø� �˴ϴ�.
		
		double rate = 64.126;
		System.out.printf("�հݷ�: %.2f%%�Դϴ�.\n", rate);
		
	}

}
