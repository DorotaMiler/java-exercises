package _f_classes._f_1_nested_class._f_1_3_local_class;

import static _f_classes._f_1_nested_class._f_1_3_local_class.CellPhoneNumberCheck.validatePhoneNUmber;

public class Main {
    public static void main(String[] args) {
        NewEnclosingClass nec = new NewEnclosingClass();
        nec.addCounts(); // prints 6

        validatePhoneNUmber("543-234-890", "512-323-888");
    }
}