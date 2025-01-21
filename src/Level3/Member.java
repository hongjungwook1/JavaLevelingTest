package Level3;

public class Member extends Human{
    private int age;
    private String email;

    public Member (String name , int age , String email) {
        super(name);
        this.age = age;
        this.email = email;
    }

    //%s = String
    //%d = int
    @Override
    public String toString() {
        return String.format("%d %s %s %d %s" , getId() , getName() , isDeleted() , age , email);
    }

}
