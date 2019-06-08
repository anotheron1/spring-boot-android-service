package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name = "interaction")
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "client_id")
    private String client_id;
    @Column(name = "client_qr")
    private String client_qr;
    @Column(name = "caffe_id")
    private String caffe_id;
    @Column(name = "all_cup")
    private String all_cup;
    @Column(name = "fill_cup")
    private String fill_cup;

    public Interaction() {
        super();
    }

    public Interaction(Long id, String client_id, String client_qr, String caffe_id, String all_cup, String fill_cup) {
        super();
        this.id = id;
        this.client_id = client_id;
        this.client_qr = client_qr;
        this.caffe_id = caffe_id;
        this.all_cup = all_cup;
        this.fill_cup = fill_cup;
    }

    public Long getId() {
        return id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_qr() {
        return client_qr;
    }

    public void setClient_qr(String client_qr) {
        this.client_qr = client_qr;
    }

    public String getCaffe_id() {
        return caffe_id;
    }

    public void setCaffe_id(String caffe_id) {
        this.caffe_id = caffe_id;
    }

    public String getAll_cup() {
        return all_cup;
    }

    public void setAll_cup(String all_cup) {
        this.all_cup = all_cup;
    }

    public String getFill_cup() {
        return fill_cup;
    }

    public void setFill_cup(String fill_cup) {
        this.fill_cup = fill_cup;
    }
}
