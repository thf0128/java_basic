package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "����", "�׿�", "����ġ", "���̾�", "������", "�����");
		System.out.println("���� ����� ģ����: " + kakao);
		System.out.print("������ ģ���� �Է��ϼ���: ");
		String name = sc.next();
		
		/*
		- �Է¹��� �̸��� ����Ʈ ������ �����ϼ���.
		���� �� ����� ����ϼ���.
		- ������ ���� �̸��̶�� ����� �ּ���.
		*/
		if(kakao.contains(name)) {
			kakao.remove(name);
			System.out.println("���� �� ����: " + kakao);
		} else {
			System.out.println("���µ���~");
		}
		sc.close();
	}
}