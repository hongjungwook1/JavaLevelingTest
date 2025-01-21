package Level2;

import java.util.Optional;

public class Human {
    private Integer id;
    private String name;
    private boolean isDeleted;

    public Human(String name ) {
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

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
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

