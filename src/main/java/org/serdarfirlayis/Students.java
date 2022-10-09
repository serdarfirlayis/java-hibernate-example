package org.serdarfirlayis;

import jakarta.persistence.*;

@Entity
@Table(name= "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private int id;
    @Column(name= "name")
    private String name;
    @Column(name= "surname")
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
