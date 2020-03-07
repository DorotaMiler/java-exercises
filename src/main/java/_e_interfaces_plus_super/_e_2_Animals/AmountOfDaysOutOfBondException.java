package _e_interfaces_plus_super._e_2_Animals;

public class AmountOfDaysOutOfBondException extends Exception{

    private final Long limitOfDays;

    public AmountOfDaysOutOfBondException(String message, Long limitOfDays){
        super(message);
        this.limitOfDays = limitOfDays;

    }
}
