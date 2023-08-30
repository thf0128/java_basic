package oop.pac;

//작성중인 패키지와 다른곳에 위치한 클래스를 사용하려면 import 선언이 필요하다.
//import oop.frult.Apple;
//import oop.frult.Banana;
//import oop.frult.Melon;
import oop.frult.*; // oop.frult 에 있는 모든 클래스를 다 가져오겠다. * : all


public class MainClass {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 직접 표시해 주어야 합니다.
		
		Apple a = new Apple(); //같은 패키지가 아니여서 Apple에 빨간줄이 뜬다.
		oop.juice.Apple a2 = new oop.juice.Apple(); 
		//다른 패키지에 같은 클래스 이름이라면 이콜 양쪽에 주소를 넣어야한다.
		Banana b = new Banana();
		Melon c = new Melon();
		
	}
}
