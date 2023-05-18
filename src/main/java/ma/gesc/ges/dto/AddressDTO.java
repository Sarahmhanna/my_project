package ma.gesc.ges.dto;

public class AddressDTO {


    private String avenue;
    private String num;
    private String rue;

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "avenue='" + avenue + '\'' +
                ", num='" + num + '\'' +
                ", rue='" + rue + '\'' +
                '}';
    }
}
