package practice.ibm.checkinplatform.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "localDate", nullable = false)
    private LocalDate localDate;
    @Column(name = "localTime", nullable = false)
    private LocalTime localTime;
    @ManyToOne
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private Class classn;

    public Schedule() {
    }

    public Schedule( LocalDate localDate, LocalTime localTime, Classroom classroom, Class classn) {
        this.localDate = localDate;
        this.localTime = localTime;
        this.classroom = classroom;
        this.classn = classn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Class getClassn() {
        return classn;
    }

    public void setClassn(Class classn) {
        this.classn = classn;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", localTime=" + localTime +
                ", classroom=" + classroom +
                ", classn=" + classn +
                '}';
    }
}
