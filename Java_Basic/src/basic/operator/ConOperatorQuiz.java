package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		/*
        - 42 ~ 396사이의 난수를 발생시킨 후
        발생한 난수가 홀수인지 짝수인지의 여부를
        3항 연산식으로 출력해 보세요.
        
        ex)
        발생한 난수: XX
        3항 연산의 결과: 홀수입니다. or 짝수입니다. 2로나눳을 때 나눠떨어지면 짝수 아니면 홀수
       */
		
		
		int rn = (int) ((Math.random()*355) + 42);
		System.out.println("발생한 난수: " + rn);
		
//		String result = (rn % 2 == 0 ? "x는 짝수입니다." : "x는 홀수입니다.");
//		System.out.println("3항 연산의 결과: " + result);
		System.out.println("3항 연산의 결과: " 
		+ (rn % 2 == 0 ? "짝수입니다." : "홀수입니다."));
		
	}

}
