package oop.static_.init;

public class DBManager {

	public static String addr;
	public static String uid;
	public static String upw;
	
	//���� ������ �ڵ����� �ʱ�ȭ�Ϸ��� ���� �ʱ�ȭ�ڰ� �ʿ��մϴ�.
	static {
		System.out.println("���� �ʱ�ȭ�ڰ� ȣ���!");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "abc1111!";
	}
	
	public DBManager() {
		System.out.println("�����ڰ� ȣ���!");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "abc1111!";
	}
	
}
