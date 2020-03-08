package _f_enum._f_1_Jeans;

import java.util.Objects;

public class Jeans {
    private JeansSize size;
    private String manufacturer;

    public Jeans() {
    }

    public Jeans(JeansSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public JeansSize getSize() {
        return size;
    }

    public void setSize(JeansSize size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Jeans{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jeans)) return false;
        Jeans jeans = (Jeans) o;
        return getSize() == jeans.getSize() &&
                Objects.equals(getManufacturer(), jeans.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getManufacturer());
    }

    public void sizePrintOut(JeansSize jeansSize) {
        if (jeansSize == null) {
            System.out.println("Please choose a jeans' size from: XS, S, M, L, XL");
        } else {
            switch (jeansSize) {
                case XS:
                    System.out.println("You bought jeans in " + JeansSize.XS.name() + " size.");
                    break;
                case S:
                    System.out.println("You bought jeans in " + JeansSize.valueOf("S") + " size.");
                    break;
                case M:
                    System.out.println("You bought jeans in " + JeansSize.M.name() + " size.");
                    break;
                case L:
                    System.out.println("You bought jeans in " + JeansSize.L.name() + " size.");
                    break;
                case XL:
                    System.out.println("You bought jeans in " + JeansSize.XL.name() + " size.");
                    break;
            }
        }
    }
}