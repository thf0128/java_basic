package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {

		/*
        # ����(�Ҵ�) ������ (=)
        # ���� ���� ������ (+=, -=, *=, /=, %=)
        - ������ ���� ������ �� ����ϴ� ������ �Դϴ�.
        - ���� ���� �����ڴ� ���� �����ڿ� ��� �����ڰ� ���յǾ� �ִ� �����Դϴ�.
        */
		
		int a = 5;
		int b = 3;
		
		b += 3; // b = b+3
		System.out.println(b);
		
        a -= 4; //4
        System.out.println(a);
        
        a *= 6; //24
        System.out.println(a);
        
        a /= 5; //4
        System.out.println(a);
        
        a %= 3; //1
        System.out.println(a);
	}

}
