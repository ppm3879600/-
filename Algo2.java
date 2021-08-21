package Practice;

import java.util.Scanner;

public class Algo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		if(a>0)System.out.println(a+"는 양수 입니다");
		else if(a<0)System.out.println(a+"는 음수 입니다");
		else System.out.println(a+"는 0 입니다");
		

	}

}
