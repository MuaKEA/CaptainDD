package sample.tomcat.Repository;


import org.springframework.data.repository.CrudRepository;
import sample.tomcat.Model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Iterable<Teacher> findAll();


}
