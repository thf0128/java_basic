package etc.api.lang.math;

public class MathQuiz {
	
	public static int page(int num) {
		return (int) Math.ceil(num / 10.0);
	}

	public static void main(String[] args) {
		
		/*
        1 ~ 10�� ���޵Ǹ� 1�� ��ȯ�ǰ�,
        11 ~ 20�� ���޵Ǹ� 2�� ��ȯ�ǰ�,
        21 ~ 30�� ���޵Ǹ� 3�� ��ȯ�ǰ�.......
        �̷��� ������ �����ϴ� static �޼��� page�� ������ ������.
        */
		
		System.out.println(page(268));
		
		
	}

}
