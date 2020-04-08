package _1_HelloWorld;

/*

Creation of a class containing:
3 fileds
2 methods: one returning a value, void, getters/setters,
equals() & hashcode()
 */

import java.util.Objects;

public class Person {
    String name;
    byte age;
    String pesel;

    public Person(byte age) {
        pesel = "";
        this.age = age;
    }

    public Person(byte age, String pesel) {
        this.age = age;
        this.pesel = pesel;
    }

    public Person(String name, byte age, String pesel) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
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

    public void setPesel(long pesel) {
        this.pesel = String.valueOf(pesel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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