package com.example.undeedma.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private Date birth_date;
    private Date created_at;
    //
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Application> applicationList;
    //
    public User(String username, String password, String email, String first_name, String last_name, Date birth_date) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.created_at = new Date();
    }
}
