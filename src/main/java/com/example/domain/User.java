package com.example.domain;

import com.example.View;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @JsonView(View.Summary.class)
    private String user_type;
    @JsonView(View.Summary.class)
    private String email;
    @JsonView(View.Summary.class)
    private String password;
    private String name;
    private String phone;
    @JsonView(View.Summary.class)
    private String client_id;
    @JsonView(View.Summary.class)
    private String caffe_id;

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getCaffe_id() {
        return caffe_id;
    }

    public void setCaffe_id(String caffe_id) {
        this.caffe_id = caffe_id;
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

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }
}
