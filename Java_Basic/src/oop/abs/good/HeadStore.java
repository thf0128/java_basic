package oop.abs.good;

public abstract class HeadStore {

	/*
    # �߻� Ŭ����, �߻� �޼���
    
    1. �߻� Ŭ������ �޼��忡 abstract�� ���̸� �ش� �޼����
     ��ü�� ���� �߻� �޼��尡 �Ǹ�, �� �޼���� ����� ���� �ڽ� Ŭ��������
     ������ �������̵��� �ϵ��� ����˴ϴ�.
     
    2. �߻�޼���� ��ü�� �������� �ʴ� Ʋ ������ �ϱ� ������
     �޼����� �ٵ� ({})�κ��� ����, �����ݷ����� �޼��� ������ �����մϴ�.
     
    3. �Ϲ� Ŭ���������� �߻� �޼��带 ������ �� �����ϴ�. �߻� �޼��尡
     �ϳ��� �����ϴ� ��쿡�� �ݵ�� �ش� Ŭ������ �߻� Ŭ������ �����ؾ� �մϴ�.
    
    4. �߻� Ŭ������ �߻� �޼��常�� ������ �ʿ�� �����ϴ�.
     �Ϲ� ������� �� �޼��嵵 �󸶵��� ������ �����մϴ�.
    */
	
	public String name;
	
	public HeadStore() {
		System.out.println("HeadStore�� ������!");
	}
	
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	
	public void orderWaterMelon() {
		System.out.println("���� �꽺�� ������ 4000�� �Դϴ�.");
	}
	
}
