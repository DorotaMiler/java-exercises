package _k_enum;

public class Jeans {
    private JeansSize size;
    private String manufacturer;

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
}