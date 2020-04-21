package _1_HelloWorld;

/*

Creation of a class containing:
3 fileds
2 methods: one returning a value, void, getters/setters,
equals() & hashcode()

-> Builder pattern aims to “Separate the construction of a
complex object from its representation so that the same
construction process can create different representations.”
 */

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private String pesel;
    private String phone;
    private String address;

    private Person(PersonBuilder builder) {
  this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }


    public void whoAmI(String name, byte age) {
        System.out.println("You are " + name + " and you are " + age + " years old");
    }

    public String getMonth() {
        return pesel.substring(2, 3);
    }

    public boolean isPeselValid() {
        return !pesel.isEmpty();
    }

    public String getPesel() {
        return pesel;
    }


    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", pesel='").append(pesel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                getName().equals(person.getName()) &&
                getPesel().equals(person.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age, getPesel());
    }
}