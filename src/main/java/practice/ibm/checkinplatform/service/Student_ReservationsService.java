package practice.ibm.checkinplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.ibm.checkinplatform.model.Student_Reservations;
import practice.ibm.checkinplatform.repository.Student_ReservationsRepository;

import java.util.Date;
import java.util.List;

@Service
public class Student_ReservationsService {

    public final Student_ReservationsRepository student_reservationsRepository;

    @Autowired
    public Student_ReservationsService(Student_ReservationsRepository student_reservationsRepository){
        this.student_reservationsRepository = student_reservationsRepository;
    }
    public Student_Reservations addStudent_Reservation(Student_Reservations student_reservations) {
        return student_reservationsRepository.save(student_reservations);
    }

    public List<Student_Reservations> findAllStudent_Reservations() {
        return student_reservationsRepository.findAll();
    }

    public Student_Reservations updateStudent_Reservations(Student_Reservations student_reservations) {
        return student_reservationsRepository.save(student_reservations);
    }

    public void deleteStudent_ReservationsById(Long id){
        student_reservationsRepository.deleteStudent_ReservationsById(id);
    }
}
