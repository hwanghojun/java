package org.java_code.test_Final;

public class classNote_test {

	public static void main(String[] args) {
//		%d : ������ ���
//		%s : ������ ���
//		%f : �Ǽ��� ���
//		%c : ���ڿ� ���
//		%n : �ٹٲ�
//		%b : boolean ���
		 //Math.pow(a,b)�� �Ǽ����� ��Ÿ���Ƿ� �Ǽ� ���� �����ϴ� double�� �����
		
		// ���� ū ��
//		if (x > y && x > z) big = x;
//		else if (y > z) big = y;
//		else big = z;
//		// ���� ���� ��
//		if (x > y && z > y) small = y;
//		else if (x > z) small = z;
//		else small = x;
//		// �߰� ��
//		if ((x > y && y > z) || (z > y && y > x)) middle = y;else if ((y > x && x > z) || (z > x && x > y)) middle = x;else middle = z;
//		int bms[] = { small, middle, big };
//		return bms;
		
		//����������
		//			Ŭ����	��Ű��	����Ŭ����	  ��ü
		//public 	O		O		O			O
		//protect	O		O		O			X
		//default	O		X		X			X
		//private	O		X		X			X
		
		for(int i=1;i<6;i++) {
			double a = Math.pow(2, i);
			System.out.println(a);
		}
	}

}
