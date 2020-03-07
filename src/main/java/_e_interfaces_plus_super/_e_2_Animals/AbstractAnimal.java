package _e_interfaces_plus_super._e_2_Animals;

public abstract class AbstractAnimal {

    abstract void allAnimlsLive();

    public void takeCareOfAnimals(int timesAWeek) {
        while (timesAWeek =<7){
            try {
                System.out.println("Animals need to be taken care of " + timesAWeek + " times a week.");
            } catch (Exception e) {
                throw new DaysOverLimitException("Incorrect amount of days: " + timesAWeek);
            }
        }
    }
}
