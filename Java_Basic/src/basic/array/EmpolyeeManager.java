package basic.array;

import java.util.Scanner;

public class EmpolyeeManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//����� ����: ���, �̸�, ����, �μ���
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		//������ �Էµ� ������(����� ����)�� ������ üũ�ϴ� ����.
		int count = 0;

		while(true) {
			System.out.println("\n========== ��� ���� ���α׷� ==========");
			System.out.println("# 1. ��� ���� �ű� ���");
			System.out.println("# 2. ��� ��� ���� ����");
			System.out.println("# 3. ��� ���� �˻�");
			System.out.println("# 4. ��� ���� ����");
			System.out.println("# 5. ��� ���� ����");
			System.out.println("# 6. ���α׷� ����");            
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt();

			if(menu == 1) {
				//��� ���� 4������ �Է¹޾� �� �迭�� �����ϴ� �ڵ带 �ۼ�.
                //����� �ߺ��Ǹ� �ȵ˴ϴ�.
                //(���ѷ����� �����ؼ� ��� �ߺ��� �߻��ϸ� �ٽ� �Է¹ޱ�.)
				
			}else if(menu == 2) {
				//�� �迭�� �ݺ����� ���� ����� �����ͱ����� ����ϵ��� �ۼ�. (count)
                //���� ����ڰ� ��� ����� �� �� ���� �ʾҴٸ�
                //"��ϵ� ��� ������ �����ϴ�." �� ����Ͻø� �˴ϴ�.
				
			}else if(menu == 3) {
				//�Է��� ����� ��ġ�ϴ� ����� 4���� ������ ��� ����ϼ���.
                //�Է��� ����� �������� �ʴ´ٸ� "��ȸ�Ͻ� ����� ������ �����ϴ�." �� ���.

			}else if(menu == 4) {
				//�ش� ����� ��ġ�ϴ� ����� ���̿� �μ��� ���������� ������ �� �ֵ���
                //���α׷��� �����Ͻð�, ���̿� �μ��� �����ϴ� �ڵ带 �ۼ��ϼ���.
                //��� �Է� -> �����ϴ� ����� �´ٸ� -> [1. ���̺��� | 2. �μ����� | 3.���]

			}else if(menu == 5) {
				//����� �Է¹޾Ƽ�
                //�ش� ����� ��ġ�ϴ� ����� 4���� ������ �� �迭���� ��� �����ϰ�
                //�����ϱ� ���� "���� �����Ͻðڽ��ϱ�? [Y/N]" �� �Է¹޾Ƽ�
                //y�� ������ �ÿ� ������ �ǵ��� �ڵ带 �����ϼ���.
                //�迭�� ũ��� ������ �ʰڽ��ϴ�. ������ �ε����� �������� �ڿ� �ִ� ������
                //������ ��ĭ�� ����� ���� count�� �ϳ� �����ֽø� �˴ϴ�.

			}else if(menu == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
			}
		} // end while true
	} // end main
}
