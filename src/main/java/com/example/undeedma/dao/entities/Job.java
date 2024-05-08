package com.example.undeedma.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Job {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String company;
    private String location;
    private Double salary;
    private Double experience;
    private String type;
    private Date posted_date;
    //
    @ManyToMany()
    @JoinTable(
            name = "job_category",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "categoy_id")
    )
    private Collection<Category> categories;
    @OneToMany(mappedBy = "job",fetch = FetchType.EAGER)
    private List<Application> applications;
    @ManyToOne(fetch = FetchType.EAGER)
    private Employer employer;
    public Job(String title, String description, String company, String location, Double salary,Double experience,String type,Collection<Category> categories) {
        this.title = title;
        this.description = description;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.experience = experience;
        this.type = type;
        this.categories = categories;
        this.posted_date = new Date();
    }
}
