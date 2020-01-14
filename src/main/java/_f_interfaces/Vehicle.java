package _f_interfaces;

/**
 * -> all METHODS are by default public and abstract (cannot be static)
 * (nothing happens if we forget to state that)
 * -> all FIELDS must be declared as public, final and static without need
 * to indicate them as final or static
 * -> interface can extend only interfaces and even a couple of them
 * -> you can implement many interfaces (in contrast to a ban of multiple
 * inheritance)
 */

public class Vehicle {
    public void move(int velocity);

    public void stop();
}
