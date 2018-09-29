package com.web.movieTheater.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "cinema_hall")
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "row_count")
    private int rowCount;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
    @OneToMany(mappedBy = "cinemaHall", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Seat> seats = new HashSet<>();
    @OneToMany(mappedBy = "cinemaHall", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<VideoSession> videoSessions = new HashSet<>();

    public Set<VideoSession> getVideoSessions() {
        return videoSessions;
    }

    public void setVideoSessions(Set<VideoSession> videoSessions) {
        this.videoSessions = videoSessions;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
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

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CinemaHall that = (CinemaHall) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
