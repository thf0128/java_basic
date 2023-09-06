package oop.poly.basic;

/*
- �ڹٿ����� �ϳ��� Ŭ���� ���Ͽ� ���� ���� Ŭ������ ������ �� �ֽ��ϴ�.
 ������ ������ �ִ� Ŭ������ ��� ���� ���� ����մϴ�.
- ��, ���ϸ�� ������ Ŭ������ �ݵ�� �����ؾ� �ϰ�,
 �ش� Ŭ������ public���� ������ �� �ֽ��ϴ�.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	- �������̶� �ڽ� ��ü�� ��� �θ��� Ÿ���� ���� �� �ִٴ� ����
 	�ǹ��մϴ�.
 	
 	- ��, �θ� Ÿ�� ������ �ڽ� ��ü�� �ּҰ��� �󸶵��� ������ �� 
 	�ִٴ� ���� �ǹ��մϴ�.
	*/
	
	int i = 5;
	double d2 = i;
	
	A v1 = new B(); // Ŭ���� Ÿ�� B -> AŸ������ �ڵ� �� ��ȯ(promotion)
	A v2 = new C();
	A v3 = new D();
	A v4 = new E();
	A v5 = b;
	
	B v6 = new D();
	C v7 = new E();
	
	//��� ���谡 ���ٸ� ������ ������ �Ұ����մϴ�.
	//��, �������� ������ ��� ���� �Ͽ����� �߻��մϴ�.
	// B v8 = new C(); (x)
	// C v9 = new D(); (x)
	// B v10 = new E(); (x)
	// D v11 = new E(); (x)
	
	//Object�� �ڹ��� �ֻ��� Ŭ�����Դϴ�.
	//��� Ŭ������ �ᱹ Object�� �ڽ��Դϴ�.
	//Object Ÿ���� �������� ��� ��ü�� ���� �� �ֽ��ϴ�.
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("�ȳ��ϼ���!");
//	Object o7 = new Basic();
	
}
