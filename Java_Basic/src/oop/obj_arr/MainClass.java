package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("±èÃ¶¼ö", 32, "³²ÀÚ");
//		Person lee = new Person("ÀÌ¿µÈñ", 25, "¿©ÀÚ");
//		Person park = new Person("¹Ú»Ç»ß", 50, "³²ÀÚ");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("±èÃ¶¼ö", 32, "³²ÀÚ");
		
//		int[] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("±èÃ¶¼ö", 32, "³²ÀÚ"),
				new Person("ÀÌ¿µÈñ", 25, "¿©ÀÚ"),
				new Person("¹Ú»Ç»ß", 50, "³²ÀÚ")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
	}
}
