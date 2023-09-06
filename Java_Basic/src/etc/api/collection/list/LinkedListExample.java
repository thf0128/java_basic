package etc.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		
		//�߰�
		list.add("ȫ�浿");
		list.add("��ö��");
		list.add("�ڿ���");

		list.addFirst("�� ��");
		list.addLast("�� ��");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out -> stack
		//push, pop, peek
		list.push("��ǻ�"); //�տ������� �߰�
		System.out.println(list);
		
		//�����ϸ鼭 �����͸� �б�
		System.out.println(list.pop());
		System.out.println(list);
	
		//�������� �����鼭 �б�
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue
		//offer, poll, peek
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);
		
	}

}
