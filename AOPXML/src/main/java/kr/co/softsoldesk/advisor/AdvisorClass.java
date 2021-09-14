package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;


public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod()호출");
	}
	
	public void aftermethod() {
		System.out.println("aftermethod()호출");
	}
	
	//--------------------------------------------------
	//반환값이 있는 메서드
	public Object aroundmethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundmethod호출");
		
		Object obj=pjp.proceed();
		System.out.println("aroundmethod 호출2");
		
		return obj;
	}
	//예외현상이 발생되지 않았을떄
	public void afterReturnmethod() {
		System.out.println("afterReturnmethod 호출");
	}
	
	//예외현상이 발생됐을 때
		public void afterThrowmethod(Throwable e1) {
			System.out.println("afterThrowmethod 호출");
			System.out.println(e1);
		}
}
