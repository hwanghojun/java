package org.java_code.object;

public class Car {
	
	String color;	//�� ����
	int speed;		//�� �ӵ�
	
	String get_color() {//���� �����ִ� �޼ҵ�
		return color;
	}
	int get_speed(){//�ӵ� �����ִ� �޼ҵ�
		return speed;
	}
	void speed_up(int a){//�ӵ� ���� �޼ҵ�
		speed += a;
		if(speed >200) speed=200;
	}
	void speed_down(int a){// �ӵ� ���� �޼ҵ�
		speed -=a;
		if(speed <0) speed=0;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed=0; //���ǵ� �ʱ�ȭ
		c1.color="����";
		System.out.println("���� ������ "+c1.get_color());
		c1.speed_up(100);
		System.out.println("���� �ӵ��� "+c1.get_speed());
		c1.speed_up(150);
		System.out.println("���� �ӵ��� "+c1.get_speed());
		c1.speed_down(300);
		System.out.println("���� �ӵ��� "+c1.get_speed());
	}
}
