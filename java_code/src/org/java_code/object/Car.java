package org.java_code.object;

public class Car {
	
	String color;	//차 색상
	int speed;		//차 속도
	
	String get_color() {//색상 보여주는 메소드
		return color;
	}
	int get_speed(){//속도 보여주는 메소드
		return speed;
	}
	void speed_up(int a){//속도 증가 메소드
		speed += a;
		if(speed >200) speed=200;
	}
	void speed_down(int a){// 속도 감소 메소드
		speed -=a;
		if(speed <0) speed=0;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed=0; //스피드 초기화
		c1.color="빨강";
		System.out.println("차량 색상은 "+c1.get_color());
		c1.speed_up(100);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_up(150);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_down(300);
		System.out.println("차량 속도는 "+c1.get_speed());
	}
}
