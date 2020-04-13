package _a_object_programming._a_2_constructor.DTO;

import java.math.BigDecimal;

public class MainDto {

    private final String firstParameter;
    private final String secondParameter;
    private final Integer thirdParameter;
    private final Boolean fourthParameter;
    private final BigDecimal fithParameter;

    public MainDto(String firstParameter, String secondParameter, Integer thirdParameter, Boolean fourthParameter, BigDecimal fithParameter){
        this.firstParameter=firstParameter;
        this.secondParameter=secondParameter;
        this.thirdParameter=thirdParameter;
        this.fourthParameter=fourthParameter;
        this.fithParameter=fithParameter;
    }

    public BigDecimal getFithParameter() {
        return fithParameter;
    }

    public String getSecondParameter() {
        return secondParameter;
    }

    public Integer getThirdParameter() {
        return thirdParameter;
    }

    public Boolean getFourthParameter() {
        return fourthParameter;
    }

    public String getFirstParameter() {
        return firstParameter;
    }
}
