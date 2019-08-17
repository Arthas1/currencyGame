package com.java21.waluty.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class CurrencyRank {


    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private int score;
    private LocalDate localDate;

    public CurrencyRank(String user, int score, LocalDate localDate) {
        this.user = user;
        this.score = score;
        this.localDate = localDate;
    }

    public CurrencyRank() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
