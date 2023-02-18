package pl.training.cdi.examples.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lombok.extern.java.Log;

@MeasureTime
@Interceptor
@Log
public class Stopper {

    @AroundInvoke
    public Object measure(InvocationContext context) throws Exception {
        long startTime = System.nanoTime();
        var result = context.proceed();
        long totalTime = System.nanoTime() - startTime;
        log.info("Execution time for method %s equals %d ns".formatted(context.getMethod(), totalTime));
        return result;
    }

}
