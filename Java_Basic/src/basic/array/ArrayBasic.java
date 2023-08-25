package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		//# �迭 (array)
		//->  ���� ������ Ÿ���� ���� ���� ���·� �����ϱ� ���� �ڷ���

		//1. �迭 ������ ����
		int[] arr; // java style
		int arr2[]; // c style

		//2. �迭 ��ü�� ���� - ���� ������ ����� ������ ����
		//������ �� �迭�� ũ�⸦ ���� �ּž� �մϴ�.
		arr = new int[5];

		//3. �迭�� �ʱ�ȭ - �迭 ���ο� ���� ������ ����.
		//�迭�� �ʱ�ȭ�� �ε����� ���� �����մϴ�.
		//�ε����� �迭 ������ ��ġ�� ������ �� �ִ� ���Դϴ�.
		//�ε����� 0������ �����Ͽ� 1�� ���������� �����մϴ�.
		//		arr = 65; (x)
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;
		//		arr[4] = "�����?"; (x)
		arr[4] = 100;
		//		arr[5] = 70; (x) index ������ �ʰ�

		//4. �迭�� �� ũ��(����) Ȯ��. -> �迭������.length
		System.out.println("arr �迭�� ����: " + arr.length);

		//5. �迭�� ����� ���� ����(���)�ϴ� �� (�ε����� �̿�)
		System.out.println("�迭�� 1��° ������: " + arr[0]);
		System.out.println("�迭�� 2��° ������: " + arr[1]);
		System.out.println("�迭�� 3��° ������: " + arr[2]);
		System.out.println("�迭�� 4��° ������: " + arr[3]);
		System.out.println("�迭�� 5��° ������: " + arr[4]);

		System.out.println("--------------------------");

		//6. �迭�� �ݺ��� ó��
		//�迭�� �ε��� ��ȣ�� ������� Ȱ���Ͽ� ���� �ݺ����� ó���� �� �ֽ��ϴ�.
		for(int idx=0; idx<=arr.length; idx++) {
			
		}
		
		//7. �迭 ������ ��Ұ��� ���ڿ� ���·� �Ѵ��� ����ϱ�
		System.out.println(Arrays.toString(arr));

		//8. �迭�� ����� ������ ���ÿ� �ϱ�
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		//�迭�� �����ʰ� ���ÿ� �� Ÿ���� �⺻������ �ڵ� �ʱ�ȭ �˴ϴ�.
		System.out.println(Arrays.toString(dArr)); //0.0
		System.out.println(Arrays.toString(sArr)); //null
		System.out.println(Arrays.toString(bArr)); //0
	
		//9. �迭�� ������ ���ÿ� �ʱ�ȭ�� �ϴ� ���.
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		//����� ���ÿ� �ʱ�ȭ�� �� ��
		//�� 1���� ������ ����
		//�迭�� ũ�Ⱑ �����̱� ������ �þ�ų� �پ�� �� �����ϴ�.
		//���� �迭�� ũ�⸦ �ø��ų� ���̰� �ʹٸ�
		//������ �迭�� �����ϴ� ���� �ƴ϶� ���Ӱ� �����ϼž� �մϴ�.
		// ó������ new String ��������
		
		String[] names = {"ȫ�浿", "��ö��", "�ڿ���"};
//		names = {"ȫ�浿", "��ö��", "�ڿ���", "��ǻ�"}; (x)
		names = new String[] {"ȫ�浿", "��ö��", "�ڿ���", "��ǻ�"};
	}

}
