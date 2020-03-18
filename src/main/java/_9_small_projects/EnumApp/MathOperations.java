package _9_small_projects.EnumApp;

public enum MathOperations {
    ADD(1, "+"),
    SUBSTRACT(2, "-"),
    MULTIPLY(3, "*"),
    DEVIDE(4, "/");

    public Integer optionNumber;
    private String sign;

    MathOperations(Integer optionNumber, String sign) {
        this.optionNumber = optionNumber;
        this.sign = sign;
    }

    public Integer getOptionNumber() {
        return optionNumber;
    }

    public String getSign() {
        return sign;
    }
}