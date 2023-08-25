package basic.loop;

public class LoopNesting {

	public static void main(String[] args) {

		/*
        # �ݺ��� ��ø (loop nesting)
        
        - �ܺ� �ݺ��� ���ο� ���� �ݺ����� �����ϴ� ���¸�
        �ݺ��� ��ø�̶�� �մϴ�.
        �ݺ��� ��ü�� �ݺ����Ѿ� �� ��쿡 ��ø�� ����մϴ�.
        
        - ���� �ݺ����� ���ᰡ �Ǿ, �ܺ� �ݺ����� ������ �ʴ´ٸ�
         ���� �ݺ����� �ܺ� �ݺ����� ������� ũ�� �� ��������
         ����ؼ� �ݺ� ����ǰ� �˴ϴ�.
        */
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** ������ " + dan + "�� ***");
			System.out.println("=========================");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			}
			System.out.println("----------------------");
			
		}
		
	}

}
