import java.math.BigDecimal;

public class Manager extends Employee{
    private String department;
    public Manager(String name, BigDecimal salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }

}
