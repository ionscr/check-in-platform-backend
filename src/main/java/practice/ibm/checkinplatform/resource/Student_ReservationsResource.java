package practice.ibm.checkinplatform.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import practice.ibm.checkinplatform.model.Schedule;
import practice.ibm.checkinplatform.model.Student_Reservations;
import practice.ibm.checkinplatform.service.ScheduleService;
import practice.ibm.checkinplatform.service.Student_ReservationsService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class Student_ReservationsResource {

    private final Student_ReservationsService student_reservationsService;
    public Student_ReservationsResource(Student_ReservationsService student_reservationsService){
        this.student_reservationsService = student_reservationsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student_Reservations>> getAllStudent_Reservations(){
        List<Student_Reservations> reservations = student_reservationsService.findAllStudent_Reservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student_Reservations> addStudent_Reservations(@RequestBody Student_Reservations student_reservations) {
        Student_Reservations newStudentReservations = student_reservationsService.addStudent_Reservation(student_reservations);
        return new ResponseEntity<>(newStudentReservations, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student_Reservations> updateStudent_Reservations(@RequestBody Student_Reservations student_reservations) {
        Student_Reservations updateStudentReservations = student_reservationsService.updateStudent_Reservations(student_reservations);
        return new ResponseEntity<>(updateStudentReservations, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent_Reservations(@PathVariable("id") Long id) {
        student_reservationsService.deleteStudent_ReservationsById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
