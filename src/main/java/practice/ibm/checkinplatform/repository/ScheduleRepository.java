package practice.ibm.checkinplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.ibm.checkinplatform.model.Schedule;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    void deleteScheduleById(Long id);
    List<Schedule> findSchedulesByDate(LocalDateTime localDateTime);

}
