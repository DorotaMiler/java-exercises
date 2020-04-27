package _g_interfaces._g_1_Comparator._g_1_1_human;

public class Human {
    private final String name;
    private final String lastName;
    private final char sex;

    public Human(HumanBuilder builder) {
        this.name = builder.name;
        this.lastName=builder.name;
        this.sex=builder.sex;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }


    public static class HumanBuilder {
        private char sex;
        private final String name;
        private final String lastName;

        public HumanBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public HumanBuilder sex(char sex) {
            this.sex = sex;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}