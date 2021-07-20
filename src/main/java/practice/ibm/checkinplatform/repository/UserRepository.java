package practice.ibm.checkinplatform.repository;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import practice.ibm.checkinplatform.model.User;

import java.util.Optional;

@Registered
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
}
