package _f_classes.Optional.NullPointerException;

public class User {

    private static final String DEFAULT_PASSWORD = "asdfg12345";
    private String login;
    private String password;
    private String name;

    public User(String name){
        if(StringUtils.isEmpty(name)){
            throw new IllegalArgumentException("Name is a mandatory field to be provided");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
