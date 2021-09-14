package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	/*public void method1() {
		System.out.println("TestBean의 메서드");
	}
	*/
	public int method1() {
		System.out.println("TestBean의 메서드");
		int i=100/0;
		return i;
	}
	
	
}
