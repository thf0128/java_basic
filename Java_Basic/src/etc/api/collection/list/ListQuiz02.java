package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {

	private int name;
	private int age;

	public static void main(String[] args) {

		/*
        1. User Ŭ������ ����(ĸ��ȭ)�� ���� name, age�� �����ؼ� ����
         UserŬ������ �����ڴ� ��� �ʵ尪�� �޴� ������ 1��.

        2. User ��ü�� ���������� �� �ִ� ArrayList�� ����. (main method)
        3. User ��ü�� 3�� �����ؼ� ����Ʈ�� �߰��ϼ���. (main method)

        4. ����Ʈ�� ����� ��� �̸�, ���̸� for������ ��� (��� for��)
        5. ����Ʈ ���� ��ü �� �̸��� "ȫ�浿" �� �ִٸ� 
              �� ��ü�� ������ �ּ���. (�Ϲ� for��)
		 */

		List<User> userList = new ArrayList<>();
		/*
		User hong = new User("ȫ�浿", 20);
		User kim = new User("�����", 5);
		User park = new User("�ڿ���", 24);

		Collections.addAll(userList, hong, kim, park);
		 */

		//		userList.add(new User("ȫ�浿", 20));
		//		userList.add(new User("�����", 5));
		//		userList.add(new User("�ڿ���", 24));

		Collections.addAll(userList, 
				new User("ȫ�浿", 20),
				new User("�����", 5),
				new User("�ڿ���", 24));
		System.out.println(userList);

		for(User user : userList) {
			System.out.println(user);
		}

		/*
        - forEach(��� for��)�� ����Ͽ� �ݺ����� ��ȸ�� ��
         ����Ʈ�� ũ�⸦ ������� ���̰ų� �ø� �� �����ϴ�.
        - ��� for���� �ݺ����� ������ �� ���������� �÷�����
         ũ�� �� ��� ������ ��ҵ��� ������ �׻� �ľ��ϰ� �ֱ� ������
         ���� ������ �Ͼ�� ���ܸ� �߻���Ű���� ����Ǿ� �ֽ��ϴ�.

		for(User user : userList) {
			if(user.getName().equals("ȫ�浿")){
				userList.remove(user);
				break;
			}
		}
		*/

		for(int i=0; i<userList.size(); i++) {
//			User u = userList.get(i);
//			String name = u.getName();
//			if(name.equals("ȫ�浿")) {
//				userList.remove(i);
//			}
			if(userList.get(i).getName().equals("ȫ�浿")) {
				userList.remove(i);
			}
		}
		
		System.out.println(userList);
		
	}
}
