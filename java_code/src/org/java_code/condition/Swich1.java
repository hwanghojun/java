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
				System.out.println("�� ���� ��");
				break;
		}
		
		
		String fruit = "��";
		
		switch(fruit) {
			case "���":
//				System.out.println("����");
//				break;
			case "����":
				System.out.println("����");
				break;
			case "��":
//				System.out.println("����");
//				break;
			case "������" :
				System.out.println("����");
				break;
			default:
				System.out.println("����");
				break;
		}
		
		int a = 2;
		
		switch(a) {
			case 1 :
			case 3 :
			case 4 :
			case 5 :
				System.out.println("����");
			 break;
			case 2:
			 System.out.println("����");
			 break;
		}
		
		if (a == 2) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		//else if {a== 1 || a==3 || a == 4 || a == 5};
	
			
	}

}
