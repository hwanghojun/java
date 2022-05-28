package org.java_code.object;

public class Smartphone {
	String phoneNumber; //폰번호
	String telecom; 	//통신사
	int remaining_battery;	//베터리 충전 정도
	int remaining_Memory;			//메모리 잔량
	int remaining_5G;					//창작 1개
	
	void phone_impormation() {
		System.out.println("폰번호는 "+phoneNumber+"입니다."); //폰번호 출력
		System.out.println("통신사는 "+telecom+"입니다.");	   //통신사 출력
		System.out.println("베터리 충전 정도는 "+remaining_battery+"% 입니다."); //베터리 충전량 출력
		System.out.println("메모리 잔량은"+remaining_Memory+"MB 입니다.");//메모리 잔량 출력
		System.out.println("5G 데이터 잔량은"+remaining_5G+"GB 입니다.");
	}
	void telecom_change(String changing_telecom) {//통신사 변경
		if(changing_telecom.equals("SKT") ||changing_telecom.equals("KT")||changing_telecom.equals("LGU")) {
			if(changing_telecom.equals(telecom)) {
				System.out.println("이미 해당 통신사입니다.");
			}else {telecom=changing_telecom;
				System.out.println("변경 완료 되었습니다.");}
		}else {System.out.println("에러");}
	}
	void charging_battery(double time) {//배터리 충전
		remaining_battery += time*30;
		if (remaining_battery>100) remaining_battery=100;
	}
	void picture_save() { //사진 촬영
		remaining_Memory-=5;
		if(remaining_Memory<=0) {
			remaining_Memory=0;
			System.out.println("메모리 부족");}
	}
	void picture_delete() {//사진 삭제
		remaining_Memory+=5;
	}
	void watching_video(double time) {
		remaining_5G-=time;
		if(remaining_5G<=0) {
			remaining_5G=0;
			System.out.println("데이터 부족");}
	}
	
	
	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Smartphone p = new Smartphone();
		p.phoneNumber="010-1234-5678";
		p.telecom="SKT";
		p.remaining_battery=20;
		p.remaining_Memory=30;
		p.remaining_5G=5;
		p.phone_impormation();
		System.out.println();
		p.telecom_change("KT");
		p.charging_battery(2);
		p.picture_save();
		p.watching_video(6);
		p.phone_impormation();

	}

}
