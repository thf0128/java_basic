package basic.method;


/*
		 # ��ȯ��, ��ȯ ���� (return value, return type)

		 1. ��ȯ���̶� �޼����� ���� ������� �ǹ��մϴ�.

		 2. �Ű������� ���� �� ������ �� ������, ��ȯ���� ���� �� ����
		  �����ؾ� �մϴ�.

		 3. ���޵Ǵ� ���� Ÿ���� ��ȯ �����̶�� �ϸ�, �޼��带 ������ ��
		  �޼��� �̸� �տ� �ݵ�� ��ȯ ������ ����ؾ� �մϴ�.

		 4. return�̶�� Ű���带 ����ϸ� return �ڿ� ������ ����
		  �����մϴ�. (����, ���)

		 5. ��ȯ���� �ִ� �޼���� ȣ�⹮ ��ü�� �ϳ��� ������ ó���� �� �ֱ� ������
		  ��ȯ���� �ٸ� ������ ������ ���� �ְ�, �ٸ� �޼����� �Ű������ε�
		  ó���� �� �ֽ��ϴ�.

		 6. ��� �޼��尡 ��ȯ���� �ִ� ���� �ƴմϴ�. �޼��� ���� �Ŀ�
		  ��ȯ�� ���� ���� ���ٸ� return�� �����ص� �˴ϴ�.

		 7. �� ���� ��ȯ������ �޼��带 ������ �� ������� ���ð�
		  void��� Ű���带 �ۼ��� �ּž� �մϴ�.

		 8. ��� �޼���� return�� ������ ������ �޼��尡 ����˴ϴ�.
		  ���� ���� ���� return�� �Ʒ��� �ڵ带 �ۼ��� �� �����ϴ�.
		  void�޼��忡���� return Ű���带 Ż�� ������� ����� �� �ֽ��ϴ�.

 */

public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
		//		System.out.println("��~~");
	}

	static int[] operateTotal(int n1, int n2) {
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
	}
	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		double avg = total / (double)nums.length;
		return new double[] {total, avg};
	}

	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	}

	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0���� �����ø� ��ؿ�!");
			return;
		}
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}

	public static void main(String[] args) {

		int r1 = add(3, 8); // int r1 = 11;
		int r2 = add(10, 15); // int r2 = 25;
		int r3 = add(add(4,6), add(7,8));
		System.out.println(r3);

		int[] totalResult = operateTotal(30, add(2,4));
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);

		/*
        1. �޼��� �̸��� calcArrayTotal�� �����ϰڽ��ϴ�.
        2. �� �޼���� ���� �迭�� �ϳ� ���޹޾Ƽ� �ش� �迭 ���ο� �ִ�
        ��� ������ �հ�(int)�� ���(double)�� '�迭'�� ��Ƽ�
        �����ϴ� �޼����Դϴ�.
        3. 2���� ������ ���Ǵ�� �޼��带 �����Ͻð�, ������ main���� ȣ���ؼ�
        �հ�� ���(�Ҽ��� ��° �ڸ�����)�� ����� �ּ���.
        {57, 89, 78, 91, 93, 47}
		 */

		int[] numbers = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(numbers);
		System.out.printf("�հ�: %.0f, ���: %.2f\n", result[0], result[1]);

		System.out.println("--------------------------------");

		/*
        - ��ȯ���� ���� void Ÿ���� �޼���� ���� ���ƿ��� �ʱ� ������
         ���� ����� ������ ������ �� ����, �ٸ� �޼����� �Ű������ε�
         ����� �Ұ����մϴ�.
        - �ݵ�� �ܵ� ȣ���Ͽ� ����ؾ� �մϴ�.
        - void �޼���� �ܼ��� ������ �����ϴ� ������ �����մϴ�.

		 */
		// int r4 = multi(10, 7); (x)
		// System.out.println(multi(10, 7)); (x)
		multi(10, 7);

		multi(add(3,4), add(4,7));
		// add(multi(4,4), multi(5,6)); (x)

		divide(20, 0);
		

	}

}
