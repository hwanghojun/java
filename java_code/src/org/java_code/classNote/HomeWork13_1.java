package org.java_code.classNote;

public class HomeWork13_1 {	
	private String name; //이름
	private String sort; //종류
	private int age;//나이
	private String gender;
 	//정보
 	public HomeWork13_1() {
 		this.age=0;
 	}
 	public HomeWork13_1(String name,String sort,String gender) {
 		this.name=name;
 		this.sort=sort;
 		this.gender=gender; 
 	}
 	public HomeWork13_1(int age) {
 		this.age=age;
 	}
 	
 	public void info() {
 		System.out.println("강아지 이름은 \'"+name+"\'입니다.");
 		System.out.println("강아지 종류는 \'"+sort+"\'입니다.");
 		System.out.println("강아지 나이는 "+age+"살 입니다.");
 	}
 	//예방접종
 	public void vaccination(int x) {
 		if(x==0) {System.out.println("예방접종이 필요합니다.");}
 		else if(x==1) {System.out.println("1차 예방접종 완료했습니다.");}
 		else {System.out.println("2차 예방접종 완료했습니다.\n예방접종을 모두 완료했습니다.");}
 	}
 	//중성화 유무
 	public void neutralization (int x) {
 		if(gender.equals("수컷")) {
 		if(x==0) {System.out.println("중성화 O");}
 		else {System.out.println("중성화 X");}}
 		else {System.out.println("암컷입니다.");}
 	} 
	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		HomeWork13_1 dog = new HomeWork13_1("우리","말티즈","암컷");
		dog.age=2;
		dog.info();
		dog.vaccination(2);
		dog.neutralization(1);

	}

}
