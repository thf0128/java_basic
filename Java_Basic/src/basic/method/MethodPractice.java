package basic.method;

public class MethodPractice {

	static int add(int n1, int n2) {
		return n1 + n2;
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
			System.out.println("0으로 나누시면 어떡해요!");
			return;
		}
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}

	public static void main(String[] args) {

		int r1 = add(3,8);
		int r2 = add(10, 15);
		int r3 = add(add(4,6), add(7,8));
		System.out.println(r3);

		int[] totalResult = operateTotal(30, add(2,4));
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);

		int[] numbers = {57, 89, 78, 91, 93, 47};
		double[]result = calcArrayTotal(numbers);
		System.out.printf("합계: %.0f, 평균: %.2f\n", result[0], result[1]);

		System.out.println("------------------------------------");

		multi(10, 7);

		multi(add(3,4), add(4,7));

		divide(20, 0);

	}
}
