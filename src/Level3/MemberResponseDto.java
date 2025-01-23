package Level3;

public class MemberResponseDto {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public MemberResponseDto(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Dto : id=%d , name=%s , age=%d , email=%s" , id , name  , age , email);
    }

}
