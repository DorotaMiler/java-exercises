package _b_inheritance._b_5_super_and_this;

public class Worker {
    private String name;
    private String lastName;
    private double payroll;

    public Worker(String name, String lastName, double payroll) {
        this.name = name;
        this.lastName = lastName;
        this.payroll = payroll;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPayroll() {
        return payroll;
    }
}