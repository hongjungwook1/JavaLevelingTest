package Level3;

public class VendorResponseDto {

    private Integer id;
    private String name;
    private int age;
    private String email;
    private String address;
    private String category;

    public VendorResponseDto(Integer id, String name, int age, String email, String address, String category) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public String toString() {
        return String.format("Vendor DTO : id=%S , name=%S , age=%S , email=%S , address=%S , category=%S"
                                    , id , name , age , email , address , category + "\n");
    }

}
