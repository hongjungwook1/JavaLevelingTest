package Level1;

public class Member extends Human {
    private int age;
    private String email;

    public Member(String name , int age , String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" +getName() + ", age=" + age + ", email='" + email + '\'' +  '}';
    }
}
