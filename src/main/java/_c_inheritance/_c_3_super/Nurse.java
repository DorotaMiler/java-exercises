package _c_inheritance._c_3_super;

public class Nurse extends Worker {
    private int overtime;

    public Nurse(String name, String lastName, double payroll) {
        super(name, lastName, payroll);
        overtime = 0;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
}