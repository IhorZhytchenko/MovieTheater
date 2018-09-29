package com.web.movieTheater.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "cinema", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<CinemaHall> cinemaHalls = new HashSet<>();

    public Set<CinemaHall> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(Set<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
