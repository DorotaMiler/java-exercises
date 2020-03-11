package _2_data_types_and_casting._2_3_generic_types._2_3_2_factual_generic_types;

public class BoxOnSteroids {

    private T fruit;

    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}