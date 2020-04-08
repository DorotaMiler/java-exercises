package _2_data_types_and_casting._2_3_generic_types._2_3_2_casting_happening;

// below class definition with generic type (<T>):
public class BoxOnSteroids<T> {

    // T we can parameterize with a different type:
    private T fruit;

    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    // compiler detects an exact return Object type with getFruit():
    public T getFruit() {
        return fruit;
    }
}