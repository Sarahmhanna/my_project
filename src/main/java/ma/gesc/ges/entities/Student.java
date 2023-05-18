package ma.gesc.ges.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Stud")
public class Student {
    @EmbeddedId
    private StudentId id;

    @Column(name = "Student_name")
    private String name;
    @Embedded
    private AddressEntity address;
    @ManyToMany (cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(name = "tab_list_course")
    List<CourStudent> courStudents;

    public StudentId getId() {
        return id;
    }

    public void setId(StudentId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public List<CourStudent> getCourStudents() {
        return courStudents;
    }

    public void setCourStudents(List<CourStudent> courStudents) {
        this.courStudents = courStudents;
    }
}
