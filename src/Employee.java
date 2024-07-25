import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public BigDecimal getSalary() { return salary; }

    public String getDetails() {
        return "Name: " + getName() + ", Salary: " + getSalary().toString();
    }


}
