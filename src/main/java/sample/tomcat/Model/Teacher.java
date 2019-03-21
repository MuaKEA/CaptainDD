package sample.tomcat.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Teacher {
@javax.persistence.Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;
private String Name;
private Integer Age;
private String Profession;
@ManyToMany
    List<Classes> ClassesList;

    public Teacher(){

    }
    public Teacher(String name, Integer age, String profession, List<Classes> classesList) {
        Name = name;
        Age = age;
        Profession = profession;
        ClassesList = classesList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Classes> getClassesList() {
        return ClassesList;
    }

    public void setClassesList(List<Classes> classesList) {
        ClassesList = classesList;
    }

    @Override
    public String toString() {


        return Name;

    }
}
