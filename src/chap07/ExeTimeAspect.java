package chap07;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.cglib.core.Signature;

public class ExeTimeAspect {
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.nanoTime();
		try{
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = (Signature) joinPoint.getSignature();
			System.out.printf("ExeTimeAspect %s.%s(%s) 실행시간 : %d ns\n",
					joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(), Arrays.toString(joinPoint.getArgs()),
					(finish - start));
		}
	}
}
