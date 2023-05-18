package ma.gesc.ges.dto;



public class StudentDto {


    private StudentIdDTO id;


    private String name;
    private AddressDTO address;

    private CourDtO courDtO;

    public StudentIdDTO getId() {
        return id;
    }

    public void setId(StudentIdDTO id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public CourDtO getCourDtO() {
        return courDtO;
    }

    public void setCourDtO(CourDtO courDtO) {
        this.courDtO = courDtO;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", courDtO=" + courDtO +
                '}';
    }
}
