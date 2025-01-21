package Level2;

public class Member extends Human {

    private int age;
    private String email;

    public Member(String name , int age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" + "Id=" + getId() + ", name=" + getName() + " , isDeleted=" + isDeleted() +" , age=" + age + ", email='" + email + '\'' + '}';
    }
}
