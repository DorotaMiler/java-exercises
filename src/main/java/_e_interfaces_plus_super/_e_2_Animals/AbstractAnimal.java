package _e_interfaces_plus_super._e_2_Animals;

public abstract class AbstractAnimal {

    abstract void allAnimlsLive();

    public void takeCareOfAnimals(int timesAWeek) throws DaysOverLimitException {
        timesAWeek => 7;
        boolean isAWeekDay = true;
        while (isAWeekDay) {
            try {
                System.out.println("Animals need to be taken care of " + timesAWeek + " times a week.");
            } catch (Exception e) {
                throw new DaysOverLimitException("Incorrect amount of days: " + timesAWeek, e);
            }
            isAWeekDay = (timesAWeek => 7) ? false : true;
        }
    }
}
