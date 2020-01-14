package _g_super;

public class Doctor extends Worker {
    private double bonus;

    public Doctor(String name, String lastName, double payroll) {
        super(name, lastName, payroll);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }
}