package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19������ ������ �����ϼż� �������� ����� ������. (for)
		//19����� ����ϼ���.
		
		int dan = (int) ((Math.random()*18) + 2); // ����
		
		System.out.println("*** ������" + dan + "�� ***");
		System.out.println("------------------------");
		
		for(int hang=1; hang<=19; hang++) {
			System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
		}
	}

}
