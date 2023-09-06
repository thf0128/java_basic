package etc.api.lang.math;

public class MathExample {

    public static void main(String[] args) {

        //�ø�
        int i = (int) Math.ceil(1.1);
        System.out.println(i);

        //����
        double d = Math.floor(1.5);
        System.out.println(d);

        //�ݿø�
        double d2 = Math.round(3.1415921000);
        System.out.println(d2);

        //����
        double d3 = Math.pow(3.0, 4.0);
        System.out.println(d3);

        //�ִ밪
        int max = Math.max(2, 10);
        System.out.println(max);

        //�ּҰ�
        int min = Math.min(24, 33);
        System.out.println(min);
    }

}