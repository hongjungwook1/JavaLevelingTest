package Level3;

public class Vendor extends Human {
    private int age;
    private String email;
    private String address;
    private String category;


    public Vendor(String name , int age , String email , String address , String category) {
        super(name);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return String.format("Vendor : id=%d , name=%s , age=%s , email=%s , address=%s , category=%s" , getId() , getName()  , age , email , address , category);
    }

}
