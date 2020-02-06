package _c_inheritance._c_4_overriding;

public class Elephant extends Animal {

    @Override
    public void eat(double weight) {
        // 1st attempt:
        // this.weight += 1 / 2 * weight

        // 2nd attempt with super()
        super.eat(1 / 2 * weight);
    }
}
