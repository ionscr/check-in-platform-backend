package practice.ibm.checkinplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.ibm.checkinplatform.model.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    void deleteClassroomById(Long id);
}
