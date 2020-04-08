package _2_data_types_and_casting._2_3_generic_types._2_3_1_basic_concept;

public class GenericEx<T> {

    public T value;

    public GenericEx(T value){
        this.value = value;
    }

    public <T> String print(T first, T second){
        System.out.println(first.getClass());
        System.out.println(second.getClass());
        return first.toString();
    }

    public <T, Y extends Person> void testMethod (T a, Y b){
    }

}
