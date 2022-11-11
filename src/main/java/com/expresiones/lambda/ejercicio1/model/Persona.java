package com.expresiones.lambda.ejercicio1.model;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

    private Integer id;
    private String name;
    private Date birthDate;

    public Persona() {
    }

    public Persona(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Persona(int id, String mito, LocalDate of) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
