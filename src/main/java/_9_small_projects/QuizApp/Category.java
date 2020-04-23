package _9_small_projects.QuizApp;

public enum Category {
    COLLECTIONS(1),
    LOOPS(2),
    INTERFACE(3),
    FRONTEND(4);

    private Integer order;

    public Category(Integer order) {
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }

    public void iterateCategory() {
        for (Category categories : Category.values()) {
            System.out.println(categories.getOrder() + " : " + categories.name());
        }
    }
}