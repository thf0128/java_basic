package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		/*
        # ArrayList
        - �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����.
        - �迭�� ������ �����̱� ������ ���������� �����Ϳ� �����ϱⰡ ����.
        - �ε����� Ȱ���ϸ�, ��ü�� �ߺ� ������ ����Ѵ�.
        */
		
		// <> -> ���׸� (Ÿ���� ������ �����Ͽ� Ÿ�� �������� ���ϱ� ���� ����)
		List<String> nick = new ArrayList<>();
		
		String str = "�߿���";
		
		//add(��ü): ����Ʈ�� ��ü�� �߰��ϴ� �޼���
		nick.add(str);
		nick.add("�۸���");
		nick.add(new String("������"));
		nick.add("±±��");
		nick.add("�߿���");
		System.out.println(nick);
		
		//add(�ε���, ��ü): Ư�� �ε����� ��ü�� �����ϴ� �޼���
		nick.add(3, "������");
		System.out.println(nick);
		
		//get(�ε���): ����Ʈ ������ ��ü�� �����ϴ� �޼���
//		String name = nick[3]; (x) �迭�� ���
		String name = nick.get(3);
		System.out.println("3�� �ε����� ��: " + name);
		
		//size(): ����Ʈ�� ũ�� ��ȯ
		System.out.println("nick�� ũ��: " + nick.size());
		
		//set(�ε���, ������ ��ü): ����Ʈ ������ ��ü�� ����
		nick.set(2, "�߾���");
		System.out.println(nick);
		
		//remove(�ε���), remove(��ü)
		nick.remove(5);
		System.out.println(nick);
		nick.remove(str);
		System.out.println(nick);
		
		//����Ʈ�� �ݺ��� ó��
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		System.out.println("-------------------------------");
		
		//��� for�� (forEach)
		for(String n : nick) {
			System.out.println(n);
		}
		
		//contains(��ü): ����Ʈ ���� ��ü�� ���� ������ �ľ��ϴ� �޼���.
		System.out.println(nick.contains("�޶ѱ�"));
		
		//indexOf: Ư�� ��ü�� �ε��� Ž��
		int idx = nick.indexOf("������");
		System.out.println("�������� �ε���: " + idx);
		
		//clear(): ����Ʈ ���� ��Ҹ� ��ü ����
		nick.clear();
		System.out.println(nick);
		
		//isEmpty(): ����Ʈ�� ����ִ����� ���� Ȯ��
		System.out.println(nick.isEmpty());
		
		/*
		# �÷��� ��ü���� Collections�� ����� ����� �� �ֽ��ϴ�.
		Collections�� �÷��� ��ü���� �ΰ� ��ɵ��� �����մϴ�.
		*/
		
		List<Integer> score = new ArrayList<>();
		score.add(65);
		
		//�ѹ��� ��ü ���� �߰��ϱ�
		Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);
		System.out.println(score);
		
		//�÷��ǿ����� ���� Ƚ�� ���ϱ�
		System.out.println("100�� �л� ��: " + Collections.frequency(score, 100));
		
		//�ִ밪, �ּҰ� ���ϱ�
		System.out.println("�ִ밪: " + Collections.max(score));
		System.out.println("�ִ밪: " + Collections.min(score));
		
		//������ ���� (���������� ������� Ŀ���� ����)
		Collections.sort(score);
		System.out.println(score);
		//������ ���� (ū ������ ������� �۾����� ����)
//		Collections.reverse(score);
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score);
		
		//�� ����� ��ġ�� ��ü: swap(����Ʈ, i, j)
		Collections.swap(score, 3, 7);
		System.out.println(score);
		
		//����Ʈ ���� ��Ҹ� �������� ����
		Collections.shuffle(score);
		System.out.println(score);
		
		//���ϴ� ������ �÷��� �ʱ�ȭ
		Collections.fill(score, 100);
		System.out.println(score);
		
	}
	
}