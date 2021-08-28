package Practice;

import java.util.Scanner;

public class Algo9 {

	
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int temp = a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
		}
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟 수:");
		int a = sc.nextInt();
		
		int[] x = new int[a];
		for(int i=0; i<x.length; i++) {
			System.out.println("x["+i+"]:");
			x[i]=sc.nextInt();
		}
		reverse(x);
		System.out.println("요소를 역순으로 정렬했습니다");
		for(int i=0;i<x.length;i++) {
		System.out.println("x["+i+"]:"+x[i]);
	}

}
}
