package etc.exception.throws_;

public class ThrowsExample {
    
    static String[] greetings = {"�ȳ�", "���", "���Ͽ�"};

    /*
     # throws
     
     - throws�� ������ ������ �޼��� ����ΰ� �ƴ� ȣ��ο� ���� ���
      ���� ó���� �޼����� ȣ��η� ���ѱ�� ����Դϴ�.
      
     - throws�� �����ڿ����� ������ �����ϸ�, �޼��峪 �����ڸ� ȣ�� ��
      ���� ó���� �����ϰ� ���� �� ����մϴ�.
      
     - ����, ���ϴ� �������� ���ܸ� ��Ƽ� �ѹ��� ó���ϴ� �͵� �����մϴ�.
     */
    
    
    static void greet(int idx) throws Exception {
        System.out.println(greetings[idx]);
    }
    
    public static void main(String[] args) {
        
        try {
            greet(3);
        } catch (Exception e) {
            //printStackTrace() �޼���� ���� �߻� ������ �������Ͽ�
            //���ܰ� ��𿡼� �߻��ߴ���, �� ������ ����������
            //�޼����� ���� �����ڿ��� �����ϹǷ� ���� ����ϴ� �޼����Դϴ�.
            e.printStackTrace();
        }
        
        System.out.println("���α׷� ���� ����!");

    }

}