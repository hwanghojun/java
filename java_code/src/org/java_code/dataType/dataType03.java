package org.java_code.dataType;

public class dataType03 {

	public static void main(String[] args) {
		//����ȯ
		boolean a;
		a = 3 == 3;
		System.out.println(a);
		System.out.println(4 != 5);
		
		int c = 2, d = 3;
		System.out.println(c == 2 && d ==1);
		System.out.println(c == 2 || d ==1);
		
		byte f; //�˶����ϰ� ������ �Ƴ����� ��
		f = 127;
		
		float g;  // �Ҽ��� �ڿ����� double�� �ν��ؼ� float ������
		g = 0.3f; //  ���� �ڿ� f�� ����Ѵ�.
		
		float q;
		q = 0.001f + 0.001f + 0.0001f;
		System.out.println(q); // �뷮�ʰ� �ε��Ҽ���������� ǥ���
		
		
		byte p;
		int o;
		p =3;
		o = p;
		p = (byte)o;
		System.out.println(p); // ����ȯ������ ���賻�Ⱑ ���� !  
	}

}
