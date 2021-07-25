package practice.ibm.checkinplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.ibm.checkinplatform.model.Student_Reservations;

@Repository
public interface Student_ReservationsRepository extends JpaRepository<Student_Reservations, Long> {
    void deleteStudent_ReservationsById(Long id);
}
