package etc.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
	
	private static final String collections = null;

	public static void main(String[] args) {
		
		//�迭�� ����
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//�迭�� Ž��: binarySearch(�迭, �˻��� ��)
		//�ݵ�� ������ ����Ǿ�� �մϴ�.
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("4�� ��ġ: " + Arrays.binarySearch(numbers, 4));
		
		//�迭�� ����
		Integer[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//������ ���� (Integer[]�� ����)
		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
		
		//�迭 ���� ��Ұ� ��� ���������� ���θ� Ȯ��
		arr[2] = 'F';
		System.out.println(Arrays.equals(arr, arr2));
		
		
	}
}
