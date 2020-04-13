package _a_object_programming._a_2_constructor.Connection;

public class Connection {
    private String url;
    private String userName;
    private char[] password;

    public Connection(String url, String userName, char[] password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public void open() {
        System.out.println("Opened with success");
    }

    public char[] getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }
}