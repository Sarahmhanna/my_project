package ma.gesc.ges.entities;

import javax.persistence.Embeddable;

@Embeddable
public class AddressEntity {


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
        return "AddressEntity{" +
                "avenue='" + avenue + '\'' +
                ", num='" + num + '\'' +
                ", rue='" + rue + '\'' +
                '}';
    }
}
