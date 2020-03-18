package _9_small_projects.EnumApp;

public enum MathOperations {
    ADD("+",),
    SUBSTRACT("-"),
    MULTIPLY("*"),
    DEVIDE("/");

    private String sign;

    MathOperations(String sign){
        this.sign = sign;
    }
}