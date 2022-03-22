package org.java_code.condition;

public class Swich1 {

	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("그 외의 수");
				break;
		}
		
		
		String fruit = "귤";
		
		switch(fruit) {
			case "사과":
//				System.out.println("맛나");
//				break;
			case "딸기":
				System.out.println("맛나");
				break;
			case "귤":
//				System.out.println("보통");
//				break;
			case "오렌지" :
				System.out.println("보통");
				break;
			default:
				System.out.println("별로");
				break;
		}
		
		int a = 2;
		
		switch(a) {
			case 1 :
			case 3 :
			case 4 :
			case 5 :
				System.out.println("오답");
			 break;
			case 2:
			 System.out.println("정답");
			 break;
		}
		
		if (a == 2) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		//else if {a== 1 || a==3 || a == 4 || a == 5};
	
			
	}

}
