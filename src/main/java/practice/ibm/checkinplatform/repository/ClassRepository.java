package practice.ibm.checkinplatform.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.ibm.checkinplatform.model.Class;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
    Optional<Class> findClassesByDate(LocalDate date);
    void deleteClassById(Long id);
}
