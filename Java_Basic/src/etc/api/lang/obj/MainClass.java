package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		Person park = new Person("�ڿ���", 24);
		Person hong = new Person("ȫ�浿", 25);

		//��ü Ÿ���� ������ ����ϰų� ���� ���� ����
		//�ڿ� �ڵ����� toString()�� �پ ����˴ϴ�.
		System.out.println(park);
		System.out.println(hong);

		if(hong.equals(park)) {
			System.out.println("�̸��� ���̰� ���׿�!");
		} else {
			System.out.println("�̸��� �ٸ� ����, ���̰� �ٸ� ����, �� �� �ٸ�����...");
		}
		
		//finalize�� gc�� ȣ��Ǵ� ������ ������� �ʱ� ������
		//����� ������� �ʽ��ϴ�. (deprecated)
		//hong = null;
		//park = null;
		//System.gc(); // ������ �÷��͸� ȣ��.(�θ��ٰ� �ٷ� �� �ü��� �ֽ��ϴ�.)

		Person kim = new Person("�躹���ΰ�", 100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("����� ��ü ����: " + clonePerson);
			System.out.println("kim�� �ּ�: " + kim.hashCode());
			System.out.println("������ ��ü �ּ�: " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}