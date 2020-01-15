package _f_interfaces_plus_super;

/**
 * -> all METHODS are by default public and abstract (cannot be static)
 * (nothing happens if we forget to state that)
 * -> all FIELDS must be declared as public, final and static without need
 * to indicate them as final or static
 * -> interface can extend only interfaces and even a couple of them
 * -> you can implement many interfaces (in contrast to a ban of multiple
 * inheritance)
 */

public interface Vehicle {

    void move(int velocity);

    void stop();

    void startEngine();

    void measureVelocity(int velocity);
}
