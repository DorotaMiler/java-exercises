package _e_enum._e_3_Environment;

public enum Environment {
    PROD("https://prod.domain.com:1088/"),
    SIT("https://sit.domain.com:2019/"),
    CIT("https://cit.domain.com:8080/"),
    DEV("https://dev.domain.com:21323/");

    private String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    // values() -> iteration over enum's list
    public void iterate() {
        for (Environment environment : Environment.values()) {
            System.out.println(environment.name() + " : : " + environment.getUrl());
        }
    }
}
