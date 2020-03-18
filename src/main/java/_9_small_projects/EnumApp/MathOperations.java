package _9_small_projects.EnumApp;

public enum MathOperations {
    ADD(1, "+"),
    SUBSTRACT(2, "-"),
    MULTIPLY(3, "*"),
    DEVIDE(4, "/");

    private String sign;
    private Integer optionNumber;

    MathOperations(Integer optionNumber, String sign) {
        this.optionNumber = optionNumber;
        this.sign = sign;
    }
}