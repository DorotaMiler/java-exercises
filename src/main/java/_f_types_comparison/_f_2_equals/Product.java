package _f_types_comparison._f_2_equals;

import java.util.Objects;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            //  the above checks if the argument is of the type
            //  Product by comparing the classes of the passed argument
            //  and this object. Same as below:
            //  if(!(o instance of Product))
            //  return false;
            return true;
        if (!(o instanceof Product))
            return false;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}