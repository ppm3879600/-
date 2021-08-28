package Practice;

import java.util.Scanner;

public class ALgo10 {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length!=b.length) return false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟 수 : ");
		int a=sc.nextInt();
		int[] x= new int[a];
		
		for(int i=0; i<x.length;i++) {
			System.out.print("a["+i+"] : ");
			x[i]=sc.nextInt();
			
		}
		System.out.print("배열 b의 요솟 수 : ");
		int b=sc.nextInt();
		int[] y= new int[b];
		
		for(int i=0; i<y.length;i++) {
			System.out.print("b["+i+"] : ");
			y[i]=sc.nextInt();
	}
		if(equals(x, y)==true)System.out.println("배열 a와b는 같습니다");
		else System.out.println("배열 a와 b는 다릅니다");
}
}
