package tn.zelda.samples.spring.tdd.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectExample {
    public static final String PRODUDCTS_ALL_METHODS = "execution(* tn.zelda.samples.spring.tdd.ProductsController.*(..))";

//	@Before(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
    //	private static final String CUSTOMER_REPOSITORY_FIND_ALL_METHOD = "execution(java.lang.Iterable springExample.persistence.CustomerRepository.findAll())";


    @Before(PRODUDCTS_ALL_METHODS)
    public void beforeProductControllerMethod(JoinPoint joinPoint) {
        System.out.println("Before ProductsController method: " + joinPoint.getSignature());
    }


    @After(PRODUDCTS_ALL_METHODS)
    public void afterProductControllerMethod(JoinPoint joinPoint) {
        System.out.println("AfterProductsController method: " + joinPoint.getSignature());
    }
}
