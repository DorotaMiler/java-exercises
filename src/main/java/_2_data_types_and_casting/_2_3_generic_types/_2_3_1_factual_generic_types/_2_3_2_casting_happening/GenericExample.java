package _2_data_types_and_casting._2_3_generic_types._2_3_1_factual_generic_types._2_3_2_casting_happening;

public class GenericExample <T> {

    private T item;

    public T getItem() {
    }

    public GenericExample(T item){
        this.item = item;
    }

    public String printItem(){
        return "Items name is: "+item.toString();
    }
}