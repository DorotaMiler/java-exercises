package _e_enum._e_2_Colour;

public enum Make {
    MERCEDES("GLA"),
    OPEL("GRANDLAND X"),
    MAZDA("CX-5"),
    FIAT("500L"),
    BMW("X7"),
    AUDI("A3");

    private String model;

    Make(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}