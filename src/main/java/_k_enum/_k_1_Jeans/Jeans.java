package _k_enum._k_1_Jeans;

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

    @Override
    public String toString() {
        return "Jeans{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    sizePrintOut(JeansSize size){
        Jeans jeans = new Jeans();
        switch(jeans.size){
            case S:
                System.out.println("You bought jeans in "+jeans.size(S));
        }

    }

}