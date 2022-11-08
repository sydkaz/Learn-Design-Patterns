package behavioral.patterns.proxy;

public class ITEmployee  implements  IEmployee{
    Integer salary;

    public ITEmployee(Integer salary) {
        this.salary = salary;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public Integer applyIncrement(Integer increment) {
        return salary+increment;
    }
}
