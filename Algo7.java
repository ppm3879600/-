package Practice;

import java.util.Scanner;

public class Algo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		System.out.print("몇 단 삼각형 입니까? : ");
		int n= sc.nextInt();
		
		
		
		for(int i=1; i<n+1;i++) {
			for(int j=1; j<=i; j++)
			System.out.print("*");
			System.out.println();
		}
		

	}

}
