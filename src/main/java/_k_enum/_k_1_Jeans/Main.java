package _k_enum._k_1_Jeans;

public class Main {
    public static void main(String[] args) {

        // 1st approach
        Jeans jeans = new Jeans(JeansSize.M, "Levis");
        System.out.println("Jean's size is: "+jeans.getSize()+"\n   manuafacturer is: "+jeans.getManufacturer());

        //  2nd approach
        jeans.sizePrintOut(JeansSize.M);
    }
}