package com.CollegeDirectory.CollegeDirectory.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "faculty_profile")
@Data
public class FacultyProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Column(name = "office_hours")
    private String officeHours;
}
