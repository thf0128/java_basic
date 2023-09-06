package oop.static_.method;

public class Count {
	
	public int a; // �ν��Ͻ� ����
	public static int b; // ���� ����
	
	
	/*
    # �ν��Ͻ� �޼���: ��ü�� �����Ͽ� �ּҰ��� ���� ������ �� ȣ���ϴ� �޼���
     �ν��Ͻ� �޼��� �ȿ����� ����(static) ������
     �ν��Ͻ� ���� ��θ� ������ �� �ֽ��ϴ�.
    */
	public int method1() {
		return this.a + Count.b;
	}
	/*
    - static���(�޼���, ���� �ʱ�ȭ��) ���ο�����
     static�� ���� ������ �޼��常 ����� �� �ֽ��ϴ�.
     this�� ����� �� �����ϴ�. -> ��Ÿ�� �ּҰ��� ���� ���� -> ��ü ���� ���̵� ȣ��Ǳ� ����.
     
    - static ��� ���ο��� non-static����� ����Ϸ���
     �ݵ�� ��ü�� �����ؼ� �ּҰ��� ���� �����ؾ� �մϴ�.
    */
	public static int method2() {
		Count ccc = new Count();
		return ccc.a + Count.b;
	}
	
}
