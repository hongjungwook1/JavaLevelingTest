package Level3;

public class Member extends Human{
    private int age;
    private String email;

    public Member (String name , int age , String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Member : id=%d , name=%s , isDeleted=%s , age=%d , email=%s" , getId() , getName() , isDeleted() , age , email);
    }

}
