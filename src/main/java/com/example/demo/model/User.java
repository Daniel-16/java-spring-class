package com.example.demo.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    public Long id;

    @NonNull
    private String fullName;

    @NonNull
    private String password;

    @NonNull
    private String email;
    

    // @OneToMany()
    // private List<Course> courses;

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
