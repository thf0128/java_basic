package etc.api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {

		/*
        # String Ŭ������ ����

        - String Ŭ������ ���� ���� ���̰� ���� ��ɵ��� ���� ������ ������
         �޸𸮸� ���Һ��ϴ� ������ �ֽ��ϴ�.

        - String ��ü�� ó�� �ʱ�ȭ�� �����Ϳ� ��ȭ�� �־�� �ϴ� ��Ȳ����
         ���� ��ü�� Ȱ������ �ʰ� ���ο� ��ü�� ����ؼ� �����մϴ�.

        # StringBuilder, StringBuffer (�ڹ� 5�������� ��� ����)

        - String Ŭ���� �������� ���� �޸� ������ �� �ӵ��� �������� ������
         �����ϱ� ���ؼ� StringBuilder�� ���Ӱ� �߰��Ǿ����ϴ�.

        - StringBuilder�� ���� ��ü�� ��� ��Ȱ���ϸ鼭 ���� ��ü ������ ����
        �����ϰ� �˴ϴ�.

        - StringBuilder, StringBuffer�� �޼��尡 �����մϴ�.
         StringBuilder -> ���� ������
         StringBuffer -> ���� �����忡�� ���ڿ��� �����ؾ� �� ��.
		 */

		String str = "hello";
		System.out.println("str�� �ּҰ�: " + str.hashCode());

		str = "hello world";
		System.out.println("str�� �ּҰ�: " + str.hashCode());

		str = "hello~!";
		System.out.println("str�� �ּҰ�: " + str.hashCode());

		System.out.println("==============================");

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb�� �ּҰ�: " + sb.hashCode());

		//���ڿ��� �� ���� �߰��ϴ� �޼��� append(���ڿ�)
		sb.append(" world");
		System.out.println(sb);
		System.out.println("sb�� �ּҰ�: " + sb.hashCode());

		//���ڿ��� Ư�� �ε����� �����ϴ� �޼��� insert(�ε���, ������ ���ڿ�)
		sb.insert(6, "my ");
		System.out.println(sb);

		//Ư�� �ε��� ������ ���ڿ��� ��ü�ϴ� �޼���: replace(begin, end, ���ڿ�)
		//�������� �̸����� �νĵ�.
		sb.replace(6, 8, "your");
		System.out.println(sb);
		
		//���ڿ� ���� Ư�� �ܾ �����ϴ� �޼���: delete(begin, end)
		sb.delete(6, 11);
		System.out.println(sb);
		
		//���ڿ��� �������� ��ġ
		sb.reverse();
		System.out.println(sb);
		
		sb.indexOf(str);
		sb.length();
		
		System.out.println("sb�� �ּҰ�: " + sb.hashCode());
		
	}
}