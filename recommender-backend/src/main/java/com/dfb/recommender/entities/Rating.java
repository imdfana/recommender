package com.dfb.recommender.entities;

import javax.persistence.*;

/**
 * Created by Dante on 2/11/2018.
 */
@Entity
public class Rating {

    private Long id;
    private Movie movie;
    private double calification;
    private User user;


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie", referencedColumnName = "id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Basic
    @Column(nullable = false, precision = 1)
    public double getCalification() {
        return calification;
    }


    public void setCalification(double calification) {
        this.calification = calification;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user", referencedColumnName = "id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}