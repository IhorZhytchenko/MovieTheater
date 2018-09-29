package com.web.movieTheater.domain;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "row")
    private int row;
    @Column(name = "number")
    private int number;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinemaHall_id")
    private CinemaHall cinemaHall;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "priceCategory_id")
    private PriceCategory priceCategory;

    public PriceCategory getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(PriceCategory priceCategory) {
        this.priceCategory = priceCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seat seat = (Seat) o;

        return id == seat.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
