package org.java_code.loop;

public class For6 {

	public static void main(String[] args) {
		int i, j;
		for(i=1; i<6; i++) {
			for(j=i;j<6;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		
		
		
		int a, b;
		for(a=0; a<5; a++) {
			for(b=0; b<5-a; b++) {
				System.out.print(a+1+b+" ");
			}System.out.println();
		}
		
		for(int q=0; q<5; q++) {
			for(int w=0; w<5; w++) {
				if(w<=q-1) {
					System.out.print("   ");
				}else {
					System.out.print(" * ");
				}
				
			}System.out.println();
		}
		
		
		for(int f=0; f<5; f++) {
			for(int g=f-1; g<f; g++) {
				if(g!=f-1 ) {
					System.out.print("   ");
				}
				System.out.print(" * ");
				}
				
			System.out.println();
		}
		
		
	}

}
