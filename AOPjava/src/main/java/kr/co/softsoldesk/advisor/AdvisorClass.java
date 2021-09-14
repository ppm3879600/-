package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {

	@Before("execution(* method1())")
	public void before() {
		System.out.println("beforeMethod()호출");
	}
	@After("execution(* method1())")
	public void after() {
		System.out.println("afterMethod()호출");
		
	}
	
	@Around("execution(* method1())")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod()호출");
		Object obj=pjp.proceed();
		
		return obj;
	}
	@AfterReturning("execution(* method1())")
		public void afterreturn()	{
		System.out.println("afterMethod()호출");
		
	}
	
	@AfterThrowing("execution(* method1())")
	public void afterthrow()	{
	System.out.println("afterMethod()호출");
	
	
	}
}
