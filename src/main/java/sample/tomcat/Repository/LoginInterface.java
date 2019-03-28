package sample.tomcat.Repository;

import org.springframework.data.repository.CrudRepository;
import sample.tomcat.Model.Logins;

import java.util.Optional;

public interface LoginInterface extends CrudRepository<Logins,Long> {

Optional<Logins> findByUsernameAndPassword(String username, String Password);


}
