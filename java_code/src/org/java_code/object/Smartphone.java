package org.java_code.object;

public class Smartphone {
	String phoneNumber; //����ȣ
	String telecom; 	//��Ż�
	int remaining_battery;	//���͸� ���� ����
	int remaining_Memory;			//�޸� �ܷ�
	int remaining_5G;					//â�� 1��
	
	void phone_impormation() {
		System.out.println("����ȣ�� "+phoneNumber+"�Դϴ�."); //����ȣ ���
		System.out.println("��Ż�� "+telecom+"�Դϴ�.");	   //��Ż� ���
		System.out.println("���͸� ���� ������ "+remaining_battery+"% �Դϴ�."); //���͸� ������ ���
		System.out.println("�޸� �ܷ���"+remaining_Memory+"MB �Դϴ�.");//�޸� �ܷ� ���
		System.out.println("5G ������ �ܷ���"+remaining_5G+"GB �Դϴ�.");
	}
	void telecom_change(String changing_telecom) {//��Ż� ����
		if(changing_telecom.equals("SKT") ||changing_telecom.equals("KT")||changing_telecom.equals("LGU")) {
			if(changing_telecom.equals(telecom)) {
				System.out.println("�̹� �ش� ��Ż��Դϴ�.");
			}else {telecom=changing_telecom;
				System.out.println("���� �Ϸ� �Ǿ����ϴ�.");}
		}else {System.out.println("����");}
	}
	void charging_battery(double time) {//���͸� ����
		remaining_battery += time*30;
		if (remaining_battery>100) remaining_battery=100;
	}
	void picture_save() { //���� �Կ�
		remaining_Memory-=5;
		if(remaining_Memory<=0) {
			remaining_Memory=0;
			System.out.println("�޸� ����");}
	}
	void picture_delete() {//���� ����
		remaining_Memory+=5;
	}
	void watching_video(double time) {
		remaining_5G-=time;
		if(remaining_5G<=0) {
			remaining_5G=0;
			System.out.println("������ ����");}
	}
	
	
	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
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
