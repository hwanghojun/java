package org.java_code.object;

public class phone {
	String number;
	boolean battery_is_full;
	
	void show_phone_number() {
		System.out.println("폰 번호는 "+number+"입니다.");
	}
	void recharge() {
		if(battery_is_full) {
			System.out.println("이미 배터리가 충전되어 있습니다.");
		}else {System.out.println("충전중입니다.");
			battery_is_full=true;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		phone p =new phone();
		p.number="010-1234-1234";
		p.battery_is_full=false;
		p.show_phone_number();
		p.recharge();
	}

}
