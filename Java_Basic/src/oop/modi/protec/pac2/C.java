package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {
	
	// A a1 new A(30); // protected
	// A a2 = new A(5.67); default (x)
	
	public C() {
		
		/* protected �����ڴ� ��Ű���� �ٸ� ���
		   �� Ŭ���� ���̿� ��� ���谡 �ִٸ�
		      super Ű���带 ���� ������ ����մϴ�.
		 */
		
		super(30);
		//super(5.67); (x) default
		super.x = 1;
		//super.y = 2; (x)
		super.method1();
		// super.method2(); (x)
		
	}
}
