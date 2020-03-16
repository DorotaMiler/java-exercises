package _f_classes._f_1_nested_class._f_1_3_local_class;

public class CellPhoneNumberCheck {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNUmber(String phoneNumber1, String phoneNumber2) {
        final int numberLength = 9;

        class CellPhoneNumber {
            String formattedCellPhoneNumber = null;

            CellPhoneNumber(String cellPhoneNumber) {
                String currentCellNumber = cellPhoneNumber.replaceAll(regularExpression, "");
                if (currentCellNumber.length() == numberLength) {
                    formattedCellPhoneNumber = currentCellNumber;
                } else {
                    formattedCellPhoneNumber = null;
                }
            }

            String getCellPhoneNumber() {
                return formattedCellPhoneNumber;
            }

            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        CellPhoneNumber myNumber1 = new CellPhoneNumber(phoneNumber1);
        CellPhoneNumber myNumber2 = new CellPhoneNumber(phoneNumber2);

        myNumber1.printOriginalNumbers();

        if (myNumber1.getCellPhoneNumber() == null)
            System.out.println("First number is invalid.");
        else
            System.out.println("First number is " + myNumber1.getCellPhoneNumber());
        if (myNumber2.getCellPhoneNumber() == null)
            System.out.println("Second number is invalid.");
        else
            System.out.println("Second number is " + myNumber2.getCellPhoneNumber());
    }
}