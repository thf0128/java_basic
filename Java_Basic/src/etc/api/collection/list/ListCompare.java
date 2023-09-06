package etc.api.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		/*
        ArrayList�� Ž�� �� ��ü�� �����ϴ� ��쿡 �����ϰ�,
        LinkedList�� ���� ����/���� ������ ����Ʈ�� ũ�Ⱑ ���� �� ����.
        ����� ũ�� �ʴٸ� ũ�� ���̴� �����ϴ�.
        */

		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();

		for(int i=0; i<1000000; i++) {
			array.add(i);
			linked.add(i);
		}

		long start, end; //���۽ð�, ���ð�

		//�迭����Ʈ���� ������ ����
		start = System.currentTimeMillis();

		for(int i=0; i<array.size(); i++) {
			array.remove(0);
		}

		end = System.currentTimeMillis();

		System.out.printf("�迭����Ʈ�� �ҿ�ð�: %dms\n", end-start);

		
		//���Ḯ��Ʈ���� ������ ����
		start = System.currentTimeMillis();

		for(int i=0; i<linked.size(); i++) {
//			linked.remove(0);
			linked.get(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("�迭����Ʈ�� �ҿ�ð�: %dms\n", end-start);
	}
}


