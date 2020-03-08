package _b_inheritance._b_5_super_and_this;

public class Doctor extends Worker {
    private double bonus;

    public Doctor(String name, String lastName, double payroll) {

        // super evokesa constructor from the class that we extend (Worker)
        // CONVENTION -> uper(parametry)
        super(name, lastName, payroll);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }
}