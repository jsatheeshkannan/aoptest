package org.vmware.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public * getName())")
	public void loggingAdvice(){
		System.out.println("logging advice aspect loaded....");
	}
	/*@After("execution(public String getName())")
	public void secondAdvice(){
		System.out.println("second advice aspect loaded....");
	}*/

}
