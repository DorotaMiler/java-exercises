package _b_inheritance._e_super_and_abstract_methods._c_3_super;

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