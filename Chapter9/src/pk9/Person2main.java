package pk9;

public class Person2main {

	public static void main(String[] args) {
		
		Person2 kim=new Person2();
		kim.name="김유신";
		kim.height=85.5f;
		kim.weight=185.0f;
		
		System.out.println(kim.name);
		System.out.println(kim.height);
		System.out.println(kim.weight);
		
		Person2 lee=new Person2("이상효",150,85);
		System.out.println(lee.name);
		System.out.println(lee.height);
		System.out.println(lee.weight);
		
	}
		
		
	
			
		
}
