package _f_classes.Optional.NullPointerException;

public class NPEEx {
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

        User user2 = fetchName("Lukasz");
        if (user2 != null) {
            System.out.println(user2.getName());
        }
    }

    private static User fetchName(String name) {
        if ("Dorota".equals(name)) {
            return new User("Dorota");
        } else
            return null;
    }
}