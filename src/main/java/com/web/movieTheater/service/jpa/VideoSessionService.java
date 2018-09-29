package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.User;
import com.web.movieTheater.domain.VideoSession;
import com.web.movieTheater.repository.VideoSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoSessionService {
    @Autowired
    private VideoSessionRepository repository;

    public VideoSession save(VideoSession videoSession) {
        return this.repository.save(videoSession);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<VideoSession> findAll() {
        return this.repository.findAll();
    }
    public VideoSession findById(Long id)
    {
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }
}
