package etc.api.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1�� ��÷ Ƚ���� �� �� ����
	static int prize2 = 0; //2�� ��÷ Ƚ���� �� �� ����
	static int prize3 = 0; //3�� ��÷ Ƚ���� �� �� ����
	static int prize4 = 0; //4�� ��÷ Ƚ���� �� �� ����
	static int prize5 = 0; //5�� ��÷ Ƚ���� �� �� ����
	static int failCnt = 0; // ��÷ Ƚ���� �� �� ����


	public static Set<Integer> createLotto() {

		/*
         - 1~45 ������ ���� 6���� �����ϼż�
          �÷��� �ڷ����� ��Ƽ� ������ �ּ���.
          ������ ���� ������� �ʰڽ��ϴ�.
          �ߺ��� �߻��ϸ� �ȵ˴ϴ�.
		 */

		Set<Integer> set = new HashSet<>();
		
		while(set.size() <= 6) {
			int i = r.nextInt(46); set.add(i);
			return set;
		}
	}


	//���ʽ� ��ȣ�� �����ϴ� �޼���
	public static int createBonusNum(Set<Integer> set) {

		/*
         - �Ű������� ���޵Ǵ� ��÷ ��ȣ ������ ���� ������ ��
          ��÷��ȣ���� ���ؼ� ���ʽ���ȣ �ϳ��� �̾� �ּ���.
          ������ ���������� 1 ~ 45 ������ �����Դϴ�.
		 */
		while(true) {
			int j = r.nextInt(45)+1;
			if(!set.contains()) {
				return set;
			}
		}


	}

	//��÷ ����� �˷��ִ� �޼���
	public static void checkLottoNumber(???, ???, ???) {
		/*
         �Ű������� ��÷��ȣ����, ������ �ζ� ��ȣ����, ���ʽ���ȣ�� �޽��ϴ�.
         �� �ζ� ��ȣ�� ��÷��ȣ�� ���Ͽ�
         ��ġ�ϴ� Ƚ���� �� �ֽ� �� ����� �Ǵ��ϼ���.
         �Ǵܵ� ����� �ش��ϴ� static ������ ���� �÷� �ֽø� �˴ϴ�.
         6�� ��ġ -> 1��
         5�� ��ġ + ���ʽ���ȣ ��ġ -> 2��
         5�� ��ġ -> 3��
         4�� ��ġ -> 4��
         3�� ��ġ -> 5��
         ������ -> ��
		 */
	}


	public static void main(String[] args) {

		//�ζ� ��ȣ ���� �޼��带 ȣ���ؼ� ��÷ ��ȣ�� �ϳ� ������Ű����.

		//���ʽ���ȣ�� �ϳ� ������Ű����.

		while(true) {
			/*
             - 1���� ��÷ �� ������ �ݺ����� �����ϴ�.
             - 1���� ��÷ �ȴٸ�, 1���� �Ǳ���� ���� ��÷ Ƚ���� ����ϰ�
              �ݺ����� �����մϴ�.
             - �ζǸ� �����ϱ� ���� �ݾ׵� ����ϼ���. (long)
			 */
		}

	}

}
