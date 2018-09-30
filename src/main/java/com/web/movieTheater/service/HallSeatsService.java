package com.web.movieTheater.service;

import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.domain.VideoSession;
import com.web.movieTheater.service.jpa.CinemaHallService;
import com.web.movieTheater.service.jpa.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Service
public class HallSeatsService {

    @Autowired
    private CinemaHallService hallService;
    @Autowired
    private SeatService seatService;

    public List<TreeSet<Seat>> getAllHallSeats(Long hallId) {
        int rowCount = hallService.findById(hallId).getRowCount();
        List<TreeSet<Seat>> result = new ArrayList<>();
        for(int i = 1; i <= rowCount; i++) {
            result.add(new TreeSet<>(seatService.findByHallIdAndRow(hallId, i)));
        }
        return result;
    }
}
