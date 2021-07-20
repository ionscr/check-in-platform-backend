package practice.ibm.checkinplatform.model;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    private User teacher;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private String section;
    @OneToMany(fetch = LAZY)
    private List<User> students;
    @ManyToOne
    private Classroom classroom;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private LocalTime time;

    public Class() {
    }

    public Class(String name, User teacher, int year, String section, List<User> students, Classroom classroom, LocalDate date, LocalTime time) {
        this.name = name;
        this.teacher = teacher;
        this.year = year;
        this.section = section;
        this.students = students;
        this.classroom = classroom;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", year=" + year +
                ", section='" + section + '\'' +
                ", students=" + students +
                ", classroom=" + classroom +
                '}';
    }
}
