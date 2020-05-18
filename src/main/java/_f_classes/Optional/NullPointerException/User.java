package _f_classes.Optional.NullPointerException;

import org.apache.commons.lang3.StringUtils;

public class User {

    private static final String DEFAULT_PASSWORD = "asdfg12345";
    private String login;
    private String password;
    private String name;

    public User() {
        throw new IllegalArgumentException("A login must be provided when user is created");
    }

    public User(String login) {
        if (StringUtils.isEmpty(login)) {
            throw new IllegalArgumentException("Login cannot be empty");
        }
        this.login = login;
        this.password = DEFAULT_PASSWORD;
    }

    public void setPassword(String password) {
        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        this.password = password;
    }

    public User(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Name is a mandatory field to be provided");
        }
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
