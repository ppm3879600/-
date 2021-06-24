package pk9;

public class Person {
		
	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Person returnSelf() {
		return this;
	}
	public static void main(String[] args) {
		
		Person noname=new Person();
		Person name=new Person("장길산", 24);
		
		System.out.println(noname.name+","+noname.age);//기본생성자객체
		System.out.println(name.age+","+name.name);//오버로딩생성자 객체
		
		System.out.println(noname.returnSelf());
				
		}

}
