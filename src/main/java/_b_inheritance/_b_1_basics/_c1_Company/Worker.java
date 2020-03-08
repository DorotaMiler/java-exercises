package _b_inheritance._b_1_basics._c1_Company;

public class Worker {

    String name;
    String lastName;
    int payroll;

    public Worker() {
        // Constructor
        name = "";
        lastName = "";
        payroll = 0;
    }

    public Worker(String a, String b, int c) {
        name = a;
        lastName = b;
        payroll = c;
    }
}
