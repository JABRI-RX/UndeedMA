package com.example.undeedma.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;
    private String industry;
    private String location;
    private String description;
    private String contactEmail;
    private Date created_at;
    //
    @OneToMany(mappedBy = "employer",fetch = FetchType.EAGER)
    private List<Job> jobs;
    public Employer(String companyName, String industry, String location, String description, String contactEmail) {
        this.companyName = companyName;
        this.industry = industry;
        this.location = location;
        this.description = description;
        this.contactEmail = contactEmail;
        this.created_at  = new Date();
    }
}
