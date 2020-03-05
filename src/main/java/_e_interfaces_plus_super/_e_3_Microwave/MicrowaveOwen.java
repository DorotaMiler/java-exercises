package _e_interfaces_plus_super._e_3_Microwave;

public interface MicrowaveOwen {

    void start();

    void setDuration(int durationInSeconds);

    vboolean isFinished();

    void setPower(int power);

    default String getName(){
        return "MicrowaveOwen";
    }
}