package Practice;

public class Algo11 {

	public static void main(String[] args) {

		System.out.println("1000이하의 소수");
		
		int count=0;
		
		for(int i=2; i<=1000; i++) {
			int n;
			for(n=2;n<i;n++) {
				count++;
				if(i%n==0)break;
			}
			if(n==i)
				System.out.println(n);
		}
		System.out.println("나눗셈을 수행한 횟수:" + count);
	}

}
