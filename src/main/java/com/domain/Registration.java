package com.domain;

import com.constant.PROFESSION;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty
    @Column(name = "fullName")
    private String fullName;

    @NotEmpty
    @Column(name = "age")
    private String age;

    @NotEmpty
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @NotEmpty
    @Column(name = "presentAddress")
    private String presentAddress;

    @NotEmpty
    @Column(name = "permanentAddress")
    private String permanentAddress;
    @NotEmpty
    @Column(name = "email")
    private String email;
    @NotEmpty
    @Column(name = "password")
    private String password;



    @NotEmpty
    @Column(name = "profession")
    private PROFESSION profession;
    public PROFESSION getProfession() {
        return profession;
    }
    public void setProfession(PROFESSION profession) {
        this.profession = profession;
    }


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

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPresentAddress() {
        return presentAddress;
    }
    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
