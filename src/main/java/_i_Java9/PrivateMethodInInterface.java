package _i_Java9;

public interface PrivateMethodInInterface {

    default void put(StringFeatures wartosc) {
        putValue();
    }

    void putValue() {
        System.out.println("Value equals 10");
    }
}