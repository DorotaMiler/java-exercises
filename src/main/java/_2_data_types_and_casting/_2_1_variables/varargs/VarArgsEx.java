package _2_data_types_and_casting._2_1_variables.varargs;

public class VarArgsEx {
    // variable arguments or variable arity
    int result;

    public int sum(int... numbers) {
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
//        the same below:
//        int sum ( int[] numbers){
//        }
}