package behavioral.patterns.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        IEmployee employee = new ITEmployee(5000);

        EmployeeInvocationHandler employeeInvocationHandler = new EmployeeInvocationHandler(employee);
        IEmployee e = (IEmployee)Proxy.newProxyInstance(IEmployee.class.getClassLoader(), new Class[] {IEmployee.class},employeeInvocationHandler);
        System.out.println(e.applyIncrement(2000));
    }
}
