package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//���� ������ (++, --)
		//������ ���� �ܼ��� �ϳ� �ø��ų� ���� �� ����մϴ�.

		int i = 1;
		int j = i++; //���� ���� (������ ������)
		int k = i--;
		
		System.out.println("i�� ��: " + i);
		System.out.println("j�� ��: " + j);
		System.out.println("k�� ��: " + k);
		
		System.out.println("----------------------------");
		
		int x = 1;
		int y = ++x; //���� ���� (������ �Ŀ���)
		int z = --x;
		
		System.out.println("x�� ��: " + x);
		System.out.println("y�� ��: " + y);
		System.out.println("z�� ��: " + z);
				
		int a = 3;
		int b = ++a + 5 * 3;
		
		System.out.println(b);
		System.out.println(a);
	}

}
