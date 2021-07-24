package practice.ibm.checkinplatform.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "localDateTime", nullable = false)
    private LocalDateTime localDateTime;
    @ManyToOne
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private Class classn;

    public Schedule() {
    }

    public Schedule( LocalDateTime localDateTime, Classroom classroom, Class classn) {
        this.localDateTime = localDateTime;
        this.classroom = classroom;
        this.classn = classn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
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
                ", localDateTime=" + localDateTime +
                ", classroom=" + classroom +
                ", classn=" + classn +
                '}';
    }
}
