package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;
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
				System.out.println("# ��� ���� ����� �����մϴ�.");
				System.out.println("- ���");
				String empNum = sc.next();
				while(true) {
					boolean flag = false;
					for(String nums : userNums) {
						if(nums == null) break;
						if(empNum.equals(nums)) {
							System.out.println("�̹� �ߺ��� ����Դϴ�.");
							flag = true;
							break;
						}	
					}
					if(!flag) { // flag = false? -> �ߺ� �߻� x
						userNums[count] = empNum;
						break; // ��� Ȯ�ο� ���� ���� Ż��.
					} else { // flag == true? -> �ߺ� �߻�!
						System.out.println("- ��� ���Է�: ");
						empNum = sc.next();
					}
				}

				System.out.print("- �̸�: ");
				names[count] = sc.next();

				System.out.print("- ����: ");
				ages[count] = sc.nextInt();

				System.out.print("- �μ���: ");
				departments[count] = sc.next();

				System.out.println(names[count] + "���� ������ ���� ��ϵǾ����ϴ�.");
				count++; // ���� ����� ���� �ε����� �����ϱ� ���� �̸� ��ġ

			}else if(menu == 2) {
				//�� �迭�� �ݺ����� ���� ����� �����ͱ����� ����ϵ��� �ۼ�. (count)
				//���� ����ڰ� ��� ����� �� �� ���� �ʾҴٸ�
				//"��ϵ� ��� ������ �����ϴ�." �� ����Ͻø� �˴ϴ�.
				if(count == 0) {
					System.out.println("��ϵ� ��� ������ �����ϴ�.");
				}else {
					System.out.println("============= ��ü ��� ���� =============");
					for(int i=0; i<count; i++) {
						System.out.printf("%s\t %s\t %d��\t %s\n", userNums[i], names[i], ages[i], departments[i]);
					}
				}

			}else if(menu == 3) {
				//�Է��� ����� ��ġ�ϴ� ����� 4���� ������ ��� ����ϼ���.
				//�Է��� ����� �������� �ʴ´ٸ� "��ȸ�Ͻ� ����� ������ �����ϴ�." �� ���.
				System.out.println("# ��ȸ�Ͻ� ����� ��ȣ�� �Է��ϼ���.");
				System.out.println("> ");
				String empNum = sc.next();

				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("========== ��� ���� =========");
						System.out.printf("%s\t $s\t %d��\t %s\n", userNums[i], names[i], ages[i], departments[i]);
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("��ȸ�Ͻ� ����� ������ �����ϴ�.");
				}

			}else if(menu == 4) {
				//�ش� ����� ��ġ�ϴ� ����� ���̿� �μ��� ���������� ������ �� �ֵ���
				//���α׷��� �����Ͻð�, ���̿� �μ��� �����ϴ� �ڵ带 �ۼ��ϼ���.
				//��� �Է� -> �����ϴ� ����� �´ٸ� -> [1. ���̺��� | 2. �μ����� | 3.���]
				System.out.println("# �����Ͻ� ����� ��ȣ�� �Է��ϼ���: ");
				System.out.println("> ");
				String empNum = sc.next();

				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("# " + names[i] + "���� ������ �����մϴ�.");
						menu4: while(true) {
							System.out.println("[1. ���� ���� | 2. �μ� ���� | 3. ���]");
							System.out.println("> ");
							int sel = sc.nextInt();

							switch(sel) {
							case 1:
								System.out.println("# �����Ͻ� ���̸� �Է��ϼ���");
								System.out.print("> ");
								ages[i] = sc.nextInt();
								System.out.printf("# ���̰� %d���� ���� ����Ǿ����ϴ�.\n", ages[i]);
								break;

							case 2:
								System.out.println("# �����Ͻ� �μ��� �Է��ϼ���.");
								System.out.print("> ");
								departments[i] = sc.next();
								System.out.printf("# �μ��� %s�� ���� ����Ǿ����ϴ�.\n", departments[i]);
								break;

							case 3:
								System.out.println("# ���� ������ ����ϰ� ���� �޴��� �����ϴ�.");
								break menu4;

							default:
								System.out.println("# ���� �޴��� �߸� �Է��ϼ̽��ϴ�.");
							}
						}
						flag = true;
						break;
					}
				}

				if(!flag) {
					System.out.println("��ȸ�Ͻ� ����� ������ �����ϴ�.");
				}

			}else if(menu == 5) {
				//����� �Է¹޾Ƽ�
				//�ش� ����� ��ġ�ϴ� ����� 4���� ������ �� �迭���� ��� �����ϰ�
				//�����ϱ� ���� "���� �����Ͻðڽ��ϱ�? [Y/N]" �� �Է¹޾Ƽ�
				//y�� ������ �ÿ� ������ �ǵ��� �ڵ带 �����ϼ���.
				//�迭�� ũ��� ������ �ʰڽ��ϴ�. ������ �ε����� �������� �ڿ� �ִ� ������
				//������ ��ĭ�� ����� ���� count�� �ϳ� �����ֽø� �˴ϴ�.

				System.out.println("# �����Ͻ� ����� ��ȣ�� �Է��ϼ���: ");
				System.out.println("> ");
				String empNum = sc.next();

				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("������ ��� �̸�: " + names[i]);
						System.out.println("���� �����Ͻðھ��? [Y/N]");
						System.out.println("> ");
						String answer = sc.next();

						switch(answer) {
						case "Y": case "y": case "��":
							if(i == userNums.length-1) {
								userNums[i] = null;
								names[i] = null;
								ages[i] = 0;
								departments[i] = null;
							}else {
								for(int j=i; j<count; j++) {
									userNums[j] = userNums[j+1];
									names[j] = names[j+1];
									ages[j] = ages[j+1];
									departments[j] = departments[j+1];
								}
							}
							count--;
							System.out.println("# ������ ���������� ����Ǿ����ϴ�.");
							break;

						case "N": case "n": case "��":
							System.out.println("# ������ ����մϴ�.");
							break;

						default:
							System.out.println("# �߸� �Է��ϼ̽��ϴ�.");
							System.out.println("# ���� �޴��� �̵��մϴ�.");
						}

						flag = true;
						break;
					}
				}

				if(!flag) {
					System.out.println("��ȸ�Ͻ� ����� ������ �����ϴ�.");
				}


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
