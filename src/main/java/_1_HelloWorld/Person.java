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

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Person {

    // only final attributes
    private final String firstName;
    private final String lastName;
    private final byte age;
    private final String pesel;
    private final String phone;
    private final String address;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.pesel = builder.pesel;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public void whoAmI(String name, byte age) {
        System.out.println("You are " + name + " and you are " + age + " years old");
    }

    // Only getters, n setters to provide immutability
    // object does not have any setter method, so it’s state
    // can not be changed once it has been built.
    public String getMonth() {
        return pesel.substring(2, 3);
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public byte getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isPeselValid() {
        return !pesel.isEmpty();
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(getPesel(), person.getPesel()) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, getPesel(), phone, address);
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private byte age;
        private String pesel;
        private String phone;
        private String address;

        public PersonBuilder(String firstName, String lastName) {
            if (StringUtils.isEmpty(firstName) || StringUtils.isBlank(firstName)){
                throw new IllegalArgumentException("First name is necessary to be given for user to be created");
            }

            if (StringUtils.isEmpty(lastName) || StringUtils.isBlank(lastName)) {
                throw new IllegalArgumentException("Password is necessary to be given for user to be created")
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder age(byte age) {
            this.age=age;
            return this;
        }

        public PersonBuilder pesel(String pesel) {
            this.pesel=pesel;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone=phone;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address=address;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
        }
    }
