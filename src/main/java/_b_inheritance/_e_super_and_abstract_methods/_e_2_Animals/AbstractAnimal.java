package _b_inheritance._e_super_and_abstract_methods._e_2_Animals;

public abstract class AbstractAnimal {

    abstract void allAnimlsLive();

    public void takeCareOfAnimals(int timesAWeek) throws DaysOverLimitException {
        timesAWeek = 8;
        boolean isAWeekDay = true;
        while (isAWeekDay) {
            try {
                System.out.println("Animals need to be taken care of " + timesAWeek + " times a week.");
            } catch (Exception e) {
                throw new DaysOverLimitException("Incorrect amount of days: " + timesAWeek, e);
            }
            isAWeekDay = timesAWeek == 8 ? false : true;
        }
    }
}
