package _f_classes._f_5_Arrays;

public class Worker {
    private String name;
    private String lastName;
    private double payout;

    public Worker(String name, String lastName, double payout) {
        this.name = name;
        this.lastName = lastName;
        this.payout = payout;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPayout() {
        return payout;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payout=" + payout +
                '}';
    }


}