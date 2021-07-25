package practice.ibm.checkinplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.ibm.checkinplatform.model.Schedule;
import practice.ibm.checkinplatform.repository.ScheduleRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }
    public Schedule addSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public List<Schedule> findAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public List<Schedule> findSchedulesByDate(LocalDate date) {
        return scheduleRepository.findSchedulesByLocalDate(date);
    }
    public void deleteScheduleById(Long id){
        scheduleRepository.deleteScheduleById(id);
    }
}
