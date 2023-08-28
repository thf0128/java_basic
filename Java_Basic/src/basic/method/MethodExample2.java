package basic.method;

/*
# �Ű� ���� (parameter, argument)

1. �Ű������� �޼��带 ȣ���� ��, �޼��� ���࿡ �ʿ��� ������
 �޼��� ���η� �����ϴ� �Ű�ü ������ �մϴ�.
 
2. �޼��� ȣ��ο��� � �Ű����� �����ϴ��Ŀ� ����
 �޼����� ���� ����� �޶��� �� �ֽ��ϴ�.
 
3. �Ű����� �� �� �޾Ƽ� ��������� �޼��带 ������ �� ����ο���
 ()�ȿ� �̸� ������ Ÿ���� �����մϴ�.
 
4. �Ű������� �̸��� ���� ���� ȣ���ڰ� ����η� ���ƿͼ�
�Ű����� Ȯ������ �ʰ�, ��� ���� ��� ��������
�� ���� �˱� ���� �����ָ� ���ο��� �����ϴ�.

5. �Ű������� �ϳ��� �������� ���� ���� �ֽ��ϴ�. �� ���� �޼����� ����ο�
 () ���θ� ����Ӵϴ�. �׸��� ȣ���� ���� ()�� ����� ȣ���մϴ�.

*/
public class MethodExample2 {

	//x���� y������ �����հ踦 ���ϴ� �޼���
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for(int i=start; i<=end; i++) {
			total += i;
		}
		return total;
	}
	
	//�Ű������� �ʿ���� ���
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "ġŲ";
		} else if(rn > 0.33) {
			return "����";
		} else {
			return "����";
		}
	}
	//���� n���� �����ϸ� �� �������� �� ���� �����ϴ� �޼���
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
//		for(int n : nums) {
//			total += n;
//		}
		return total;
	}
	
	//�����μ� (���� �Ķ����)�� ����� �Ű����� �ۼ�.
	//�޸��� �����Ǿ� ������ �������� ���� �迭�� ��� ���η� �����մϴ�.
	static int calcNumberTotal2(int... nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		return total;
	}
	
	public static void main(String[] args) {

		int result = calcRangeTotal(34, 96);
		System.out.println(result);
		
		System.out.println("���� ���� ������???: " + selectRandomFood());
		
		int[] arr = {10, 30, 50, 70, 90, 110, 130};
		int sum = calcNumberTotal(arr);
		System.out.println("������: " + sum);
		
		sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7});
		System.out.println("������: " + sum);
		
		//���� �Ķ���Ϳ� ���� ���� ���� �޸��� �� �����Ͻðų�
		//�迭�� �����ؼ� ������ �˴ϴ�.
		sum = calcNumberTotal2(1,2,3,4,5,6,7);
		System.out.println("������: " + sum);
	}
}
