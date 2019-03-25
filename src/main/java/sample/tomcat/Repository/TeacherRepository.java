package sample.tomcat.Repository;


import org.springframework.data.repository.CrudRepository;
import sample.tomcat.Model.Teacher;

import java.util.Optional;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Iterable<Teacher> findAll();
    Optional<Teacher> findById(Long id);

}
