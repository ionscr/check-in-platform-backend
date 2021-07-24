package practice.ibm.checkinplatform.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.ibm.checkinplatform.model.Schedule;
import practice.ibm.checkinplatform.service.ScheduleService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleResource {
    private final ScheduleService scheduleService;

    public ScheduleResource(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Schedule>> getAllSchedules(){
        List<Schedule> schedules =scheduleService.findAllSchedules();
        return new ResponseEntity<>(schedules, HttpStatus.OK);
    }
    @GetMapping("/date/{date}")
    public ResponseEntity<List<Schedule>> getSchedulesByDate(@RequestBody Date date) {
        List<Schedule> schedules = scheduleService.findSchedulesByDate(date);
        return new ResponseEntity<>(schedules, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Schedule> addSchedule(@RequestBody Schedule schedule) {
        Schedule newSchedule = scheduleService.addSchedule(schedule);
        return new ResponseEntity<>(newSchedule, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Schedule> updateFeature(@RequestBody Schedule schedule) {
        Schedule updateSchedule = scheduleService.updateSchedule(schedule);
        return new ResponseEntity<>(updateSchedule, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSchedule(@PathVariable("id") Long id) {
        scheduleService.deleteScheduleById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
