package behavioral.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler {

    IEmployee targetObject;

    public EmployeeInvocationHandler(IEmployee targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(targetObject,args);
    }
}
