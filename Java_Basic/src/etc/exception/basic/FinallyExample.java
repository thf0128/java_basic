package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {

		String[] pets = {"������", "�����", "±±��"};

		for(int i=0; i<=pets.length; i++) {
			try {
				System.out.println(pets[i] + " Ű��� �ʹ�~");
			} catch(Exception e) {
				System.out.println("�ֿϵ����� ������ �����ϴ�.");
			} finally {
				//finally ��Ͽ��� ���� �߻� ���ο� ��� ����
				//�׻� �����ϰ� ���� ������ �ۼ��մϴ�.
				//��ü�� �ݳ��ϰų� �޸𸮿��� ������ �� (close()) finally�� �ַ� ����մϴ�.
				System.out.println("�ƹ�ư ����Ǵ� �����Դϴ�.");
				System.out.println("----------------------");
			}
		}
		
		
	}

}
