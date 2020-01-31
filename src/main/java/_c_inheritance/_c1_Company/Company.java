package _c_inheritance._c1_Company;

public class Company {
    public static void main(String[] args) {
        Worker worker = new Worker("Dorota", "Miler", 3000);
        System.out.println("Worker's name: " + worker.name);
        System.out.println("Last name: " + worker.lastName);
        System.out.println("Payroll: " + worker.payroll + "\n");

        Boss boss = new Boss();
        // default:
        System.out.println("Boss's name: " + boss.name);
        System.out.println("Last name: " + boss.lastName);
        System.out.println("Payroll: " + boss.payroll);
        System.out.println("Bonus: " + boss.bonus + "\n");

        // exemplary fields
        boss.name = "Adam";
        boss.lastName = "Kwiatkowski";
        boss.payroll = 5000;
        boss.bonus = 3000;
        System.out.println("Name: " + boss.name);
        System.out.println("Last name: " + boss.lastName);
        System.out.println("Payroll: " + boss.payroll);
        System.out.println("Bonus: " + boss.bonus);
    }
}
