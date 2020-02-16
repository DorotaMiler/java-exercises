package _k_enum._k_1_Jeans;

public enum JeansSize {
    XS,
    S,
    M,
    L,
    XL;

    private char size;

    public char getSize() {
        return size;
    }
    JeansSize(final String size){
        this.size = size;
    }

}