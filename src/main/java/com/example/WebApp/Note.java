package com.example.WebApp;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private ImportanceEnum importanceEnum;
    @Column
    private String text;
    @Column
    private Date timestamp;

    public void setId(Integer id) {
        this.id = id;
    }
}