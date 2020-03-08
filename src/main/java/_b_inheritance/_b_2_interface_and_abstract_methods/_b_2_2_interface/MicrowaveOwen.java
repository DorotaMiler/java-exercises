package _b_inheritance._b_2_interface_and_abstract_methods._b_2_2_interface;

import java.time.Duration;

public interface MicrowaveOwen {

    void start();

    void setDuration(int durationInSeconds);

    boolean isFinished();

    void setPower(int power);

    // default methods in interface possible to be overridden
    // they can have their own implementation in interface's body
    default String getName() {
        return "MicrowaveOwen";
    }

    default Duration getRecommendedDefrostTime(double foodWeightInGrams) {
        double frostRate = 0.8;
        int power = 300;
        return getRecommendedTime(power, frostRate, foodWeightInGrams);
    }

    default Duration getRecommendedWarmingTime(double foodWeightInGRams) {
        double frostRate = 0.2;
        int power = 700;
        return getRecommendedTime(power, frostRate, foodWeightInGRams);
    }

    //  private methods allow to avoid repetion of code within
    //  interface definition ( interface { ..} )
    private Duration getRecommendedTime(int power, double frostRate, double foodWeightInGrams) {
        double durationInMinutes = foodWeightInGrams / ((1 - frostRate) * power);
        long durationInSeconds = (long) (durationInMinutes * 60);
        return Duration.ofSeconds(durationInSeconds);
    }
}