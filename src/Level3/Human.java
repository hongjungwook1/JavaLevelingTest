package Level3;

public class Human {

    private Integer id;
    private String name;
    private boolean isDeleted = false;

    public Human (String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void activationIsDeleted() {
        isDeleted = true;
    }
    public void inActivationIsDeleted() {
        isDeleted = false;
    }
}
