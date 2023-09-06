package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {

		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;

		// boxing: �⺻ ������ Ÿ���� ��ü Ÿ������ ��ȯ�ϴ� ���� (���� x)
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character('Z');
		Double v4 = new Double(d);
		
		//unboxing: ��ü Ÿ������ ����� ���� �⺻ ������ Ÿ������ Ǯ��� ���� (���� x)
//		int i = v1.intValue();
		
		//autoboxing: �⺻ Ÿ���� �ڵ����� ��ü������ ��ȯ
		Integer x1 = a;
		Boolean x2 = false;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing: ��ü ������ �⺻������ �ڵ� ���� ����.
		int i = x1;
		double d2 = x4;
		
		//AutoBoxing ���Ŀ� wrapper Ŭ������ ���ڿ��� �⺻������
        //��ȯ�ϴ� �� ���� ���˴ϴ�.
        
        //�ش� Ÿ������ ��ȯ�� �� ���� ���ڿ��� �õ����� ���
        //NumberFormatException ���ܰ� �߻��մϴ�.
		String s2 = "3.14";
		Integer.parseInt(s2);
		
		
	}

}