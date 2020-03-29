package _b_inheritance._b_5_super_and_this._b_5_1_hospital;

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