package com.renegadeapps.eticketingservice.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venue")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "street_name")
    private String street_name;

    @Column(name = "number")
    private Integer number;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zip_code;

    public Venue() {

    }

    public Venue(String name, String street_name, Integer number, String city, String zip_code) {
        this.name = name;
        this.street_name = street_name;
        this.number = number;
        this.city = city;
        this.zip_code = zip_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
