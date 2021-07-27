package practice.ibm.checkinplatform.model;

import javax.persistence.*;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @Column(name = "feature" ,nullable = false)
    private String feature;

    public Feature() {
    }

    public Feature(Classroom classroom, String feature) {
        this.classroom = classroom;
        this.feature = feature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", classroom=" + classroom +
                ", feature='" + feature + '\'' +
                '}';
    }
}
