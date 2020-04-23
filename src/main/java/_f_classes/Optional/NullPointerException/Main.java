package _f_classes.Optional.NullPointerException;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        // wrong: user1.getName() -> method exec on null
        User[] users = new User[10];
        // wrong: users[0].setName("Adam"); -> attempt to envoce null.setName()

        for (int i = 0, i<users.length;,i++){
            users[i] = new User();
        }

        // correct:
        users[0].setName("Adam");
    }
}
