package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {

		//��(����) ������ (<, <=, >, >=, ==, !=)
		//���װ� ������ ũ�⸦ ���Ͽ�, ���������
		//�׻� ���� Ÿ���� ���� �����մϴ�.
		
		int x = 10, y = 20;
		System.out.println(x != y);
		
		/*
        # �� ������ (&, &&, |, ||)
        - ���װ� ������ ������ �����Ͽ� �ϳ��� ������ �����մϴ�.
        1. &, &&: ���� ���� ������ ��� true�� ��쿡�� true�� ����˴ϴ�.
        2. |, ||: ���� ���� ���� �� �� �ʸ� true���� true�� �����մϴ�.
        
        &&, || -> ���� �� ���� (short circuit operation)
        - ������ ���� ����� ��ü ���� ����� ������ ��ĥ ���
         ������ ������ �������� �ʽ��ϴ�.
        */
		
		System.out.println(x > 10 && (y / 0 == 10));
		System.out.println(x >= 10 || (y / 0 == 10));
		
		// �� ���� ���� (!: ����)
		//�ܼ��� ������ ������ų �� ����մϴ�.
		//true -> false, false -> true
		
		int z = 10;
		System.out.println(!(z == 10));
		
		
		
	}

}
