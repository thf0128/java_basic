package basic.begin;

public class Identifier {

	public static void main(String[] args) { 

		//1. �ĺ����� �̸��� �ߺ��� ������ �ʽ��ϴ�.
		// �׸���, ��/�ҹ��ڸ� ö���ϰ� �����մϴ�.
		
		int age = 35;
//		int age = 40; (x) age ���� �ߺ������̶� �ȵ�
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		//2. �ĺ��� �̸��� ���ڷ� �����ϰų� ���ڷ� �����Ͻø� �ȵ˴ϴ�.
//		int 700 = 365;(x)
//		int 7number = 7;(x)
		int number7 = 7;
		int num7ber = 7;
		int num12345ber = 123;
		
		//3. �ĺ��� �̸��� ������ ������ �� �����ϴ�.
//		int my birth day = 19921013;
//		int my_birth_day = 19921013; //snake case
//		int my-birth-day = 19921013; //kebab case
		int mybirthday = 19921013;
		int myBirthDay = 19921013; //camel case
		
		//4. �ĺ��ڿ� �� �� �ִ� Ư�����ڴ� ����(_), �޷���ȣ($)
		//���Դϴ�. ������ ����� ���������� �ʽ��ϴ�.
		//�� Ư�����ڵ��� ����ϱ�� ��ӵ� ���� �����Ǿ� �ֽ��ϴ�.
		String $hello_ = "�ȳ�";
		
		//5. Ű����(�����)�� �ĺ��� �̸����� ����� �Ұ����մϴ�.
		//Ű����� �̹� ��� ������ �����ϰ� �ִ� ���� �����Դϴ�.
//		String class = "Ŭ����"; // Ŭ������ ���� ����ο��� Ű����� ���� ����
		String Class = "Ŭ����"; //(�������� �ʽ��ϴ�.)
		String className = "Ŭ����";
		
		//6. �ѱ��̳� ���� ���� �ĺ��� �̸��� ������ �����մϵ��
		//����� ���������� �ʽ��ϴ�.
		int ���� = 10;
		String ٣ = "�����";
		System.out.println(����);
		System.out.println(٣);
	}

}
