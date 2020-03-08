package test.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public interface TestAcpect {
	@Pointcut("execution(* test.dao.*.*(..))")
	public void pointCut();

	@Before("pointCut()")
	public void before();

}
