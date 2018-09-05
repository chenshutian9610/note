package spring.beans;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component("aspect")
@Aspect
public class MyAspect{
	@Pointcut("execution(void spring.beans.DML.*())")
	public void cut(){
		
	}
	@Around("cut()")
	public Object around(ProceedingJoinPoint point)throws Throwable{
		System.out.println(".....");
		Object object=point.proceed();
		System.out.println("*****");
		return object;
	}
}
