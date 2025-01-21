package Level2_2;

public class Human {
    private Integer id;
    private String name;
    private Boolean isDeleted;

    public Human(String name) {
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

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}

