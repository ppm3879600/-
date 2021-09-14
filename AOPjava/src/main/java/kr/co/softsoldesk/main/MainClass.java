package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean xml1=cpx.getBean(TestBean.class);
		xml1.method1();
		
		cpx.close();
		
		
		
		
		
		AnnotationConfigApplicationContext apx= new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean bean=apx.getBean(TestBean.class);
		bean.method1();
		
		apx.close();

	}

}
