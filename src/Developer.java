import java.math.BigDecimal;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, BigDecimal salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() { return programmingLanguage; }

    public String getDetails() {
        return super.getDetails() + ", Programming language: " + programmingLanguage;
    }

}
