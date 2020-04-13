package _2_data_types_and_casting._2_3_generic_types._2_3_1_basic_concept;

public class GenericEx<T> {

    public T value;

    public GenericEx(T value) {
        this.value = value;
    }

    public <T> String print(T a, T b) {
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        return a.toString();
    }

    public <T, Y extends Person> void testMethod(T a, Y b) {
    }

    public <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

//    public <T extends Number> double add(T... numbers) {
//        double result;
//        for (T number : numbers) {
//            result += number.doubleValue();
//        }
//        return result;
//    }
}