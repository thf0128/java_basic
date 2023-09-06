package etc.api.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import etc.api.lang.obj.Person;

public class HashSetExample {

	public static void main(String[] args) {

		/*
        # Set
        - ������ ������ ���� �������̽�
        - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�.
        
        # Hash
        - � ���� �־��� �� ���� �������� ���� ���� �����Ǿ�� �ϴ� �˰���
        - ������ �� ���� ���� �̿��ϱ� ������ ������ �Ұ���.
        - ������ ������ ���� ���� ã�� �͵� �Ұ��ɿ� ������.
        - �ٽ� ���� ������ ���ư� �� ���� �ܹ��⼺ �˰���
        - �ӵ��� ������ ���ȼ��� �پ �˰���. ��ü�� �ּҰ��� �Ҵ��ϰų�
         ��ȣȭ �˰��򿡼� ���� ���˴ϴ�.
        */
		
		Set<String> set = new HashSet<>();
		
		//��ü�� ����: add(��ü)
		set.add("Java");
		set.add("JSP");
		set.add("Spring");
		set.add("Oracle");
		Collections.addAll(set, "MySQL", "JAVA");
		System.out.println(set);
		
		//set�� ũ�⸦ Ȯ��: size()
		System.out.println("set�� ũ��: " + set.size());
		
		 /*
        - set�� �ε����� ���� ������ �޼��带 �̿��ؼ� ��ü�� ��°� �ƴ϶�
         �ݺ��� (Iterator)�� ���ؼ� ��Ҹ� �ϳ��� ���� ���ž� �մϴ�.
         �ݺ��� ��ü�� set �������̽��� �����ϴ� iterator()�� ȣ���Ͽ�
         ���ɴϴ�.
        */
		
		Iterator<String> iter = set.iterator();
		
		/*
        Iterator ��ü�� �޼��� next()�� ����
        ���� ��Ҹ� �ϳ��� ������ �� �ֽ��ϴ�.
        next()�� ����� �������� ���� ȣ���ϰ� �Ǹ�
        NoSuchElement ���ܰ� �߻��մϴ�.
        
        hasNext() -> �ݺ��ڰ� ������ �ִ� ��ü�� �� ������ �� �� �ִ�����
        ���θ� Ȯ���ϴ� �޼��带 ���� next()�� ȣ���ϼž� �մϴ�.
        */
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("------------------------------------");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		//set���� ��ü�� ����: remove(��ü)
		set.remove("JSP");
		System.out.println(set);
		
		//set�� list�� ��ȯ -> �������� �Ű������� set�� ����.
		
		List<String> convertedList = new ArrayList<>(set);
		System.out.println(convertedList);
		
		set.clear();
		System.out.println(set);
	
		/*
		# ��ü���� equals �޼��带 �������̵� �� �� hashCode�� ���� �������̵� �ؾ� �ϴ� ����
		- Hash �˰����� ����ϴ� �ٸ� ��ü�� ������ �Ӽ��� ��� �Ϸ���
		��ü�� �ʵ尪�� ������ �� ���� hashCode�� ���� ��� �� ��� �Ѵ�. 
		(HashSet -> HashCode�� ���� �ߺ� ���θ� Ȯ���ϱ� ����.)
		*/
		
		
		Set<Person> personSet = new HashSet<>();
		
		Person kim = new Person("�����", 30);
		Person kim2 = new Person("�����", 30);
		
		personSet.add(kim); personSet.add(kim2);
		System.out.println(personSet);
		
		String str = new String("����");
		String str2 = new String("����");
		System.out.println(str == str2);
		System.out.println(str.hashCode() == str2.hashCode());
		
	}
}
