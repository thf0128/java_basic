package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [�̸�=" + name + ", ����=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	//equals�� �������̵� �� ���� hashCode�� �Բ� �������̵��� ������ �ֽô� ���� �����ϴ�.
	//equals�� �� �����Ѵٴ� ���� �� ���ϴ� ����� ���� �񱳸� �ϰڴٴ� ���̱� ������
	//hashcode�� ���� �׿� �°� ���� �� ���ǰ� �Ǿ�� �մϴ�.(hash �ּҸ� equals�� �°� ����)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// ������ ��ü�� ������� �������� �ڵ����� ȣ�� (gc�� ����� ��)
		System.out.println(this.name + "��(��) �ְν��ϴ� �̤�");
	}
	
	//��ü ���� �޼���
	//Cloneable �������̽��� �����ؼ� ����ؾ� �մϴ�.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void personInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "��");
	}
}