package sample.tomcat.Model;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Classes {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String CourseName;

    public Classes(){}

    public Classes(String courseName) {
        CourseName = courseName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public String toString() {

        return CourseName;

    }
}
