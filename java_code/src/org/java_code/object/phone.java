package org.java_code.object;

public class phone {
	String number;
	boolean battery_is_full;
	
	void show_phone_number() {
		System.out.println("�� ��ȣ�� "+number+"�Դϴ�.");
	}
	void recharge() {
		if(battery_is_full) {
			System.out.println("�̹� ���͸��� �����Ǿ� �ֽ��ϴ�.");
		}else {System.out.println("�������Դϴ�.");
			battery_is_full=true;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		phone p =new phone();
		p.number="010-1234-1234";
		p.battery_is_full=false;
		p.show_phone_number();
		p.recharge();
	}

}
