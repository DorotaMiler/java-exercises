package _2_data_types_and_casting._2_3_generic_types._2_3_3_Calculator;

public interface Calculator<T> {
    double PI = 3.14159;

    double add(T... args);
    double subtract(T... args);
    double multiply(T... args);
    double divide(T... args);
}