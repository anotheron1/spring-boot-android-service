package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    private String email;
    private String password;
    private String name;
    private String phone;
    private String clients_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getClients_id() {
        return clients_id;
    }

    public void setClients_id(String clients_id) {
        this.clients_id = clients_id;
    }
}
