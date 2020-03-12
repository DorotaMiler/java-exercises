package _2_data_types_and_casting._2_3_generic_types._2_3_1_factual_generic_types._2_3_2_casting_happening;

public class GenericExample<T> implements Figure {

    private T item;
    private String name;

    public GenericExample(T item) {
        this.item = item;
    }

    public String getItemName() {
        return item.getName();
    }

    public T getItem() {
        return item;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public void printItem() {
        System.out.println("Item's " + item. + "class name is: " + item.getClass().getSimpleName());
    }
}