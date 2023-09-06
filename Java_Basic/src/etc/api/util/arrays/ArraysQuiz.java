package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {

		/*
        - ������ ����� �̸��� ��� �迭 participant��
        ������ ����� �̸��� ��� �迭 completion�� �־��� ��
        �������� ���� ������ �̸��� return�ϴ� solution �Լ��� �ϼ��ϼ���.
        �������� ���� �ڴ� 1���̶�� �����մϴ�.
		*/
		Arrays.sort(participant);
		Arrays.sort(completion);


		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}

		return participant[participant.length - 1];
		
	}


	public static void main(String[] args) {

		String[] participant = {"ȫ�浿", "��浿", "��ö��", "��ö��", "�ڿ���"};
		String[] completion = {"��ö��", "�ڿ���", "��浿", "��ö��"};

		System.out.println("�������� ���� ��: " + solution(participant, completion));

	}
}
