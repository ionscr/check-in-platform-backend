package practice.ibm.checkinplatform.model;

import javax.persistence.*;
@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private int role;
    @Column(nullable = true)
    private int year;
    @Column(nullable = true)
    private String department;
    @Column(nullable = true)
    private String section;
    @Column(nullable = true)
    private String f_group;

    public User() {
    }

    public User(String first_name, String last_name, int role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public User(String first_name, String last_name, int role, int year, String department, String section, String f_group) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.year = year;
        this.department = department;
        this.section = section;
        this.f_group = f_group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGroup() {
        return f_group;
    }

    public void setGroup(String f_group) {
        this.f_group = f_group;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", role=" + role +
                ", year=" + year +
                ", department='" + department + '\'' +
                ", section='" + section + '\'' +
                ", f_group='" + f_group + '\'' +
                '}';
    }
}
