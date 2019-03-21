package sample.tomcat.Repository;


import org.springframework.data.repository.CrudRepository;
import sample.tomcat.Model.Classes;

public interface ClassesInterface extends CrudRepository<Classes,Long> {
}
