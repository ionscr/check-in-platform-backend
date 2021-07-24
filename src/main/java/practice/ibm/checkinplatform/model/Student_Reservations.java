package practice.ibm.checkinplatform.model;

import javax.persistence.*;

@Entity
public class Student_Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    private Schedule schedule;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private User student;

    public Student_Reservations() {
    }

    public Student_Reservations(Schedule schedule, User student) {
        this.schedule = schedule;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Student_Reservations{" +
                "id=" + id +
                ", schedule=" + schedule +
                ", student=" + student +
                '}';
    }
}
