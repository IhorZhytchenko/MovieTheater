package com.web.movieTheater.service.jpa;

import com.web.movieTheater.domain.Seat;
import com.web.movieTheater.domain.User;
import com.web.movieTheater.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return this.repository.save(user);
    }
    public void delete(Long id) {
        if (id != null) {
            this.repository.deleteById(id);
        }
    }
    public List<User> findAll() {
        return this.repository.findAll();
    }
    public User findById(Long id)
    {
        System.out.println(id);
        return this.repository.findById(id).orElse(null);
    }
    public boolean exists(Long id) {
        return this.repository.existsById(id);
    }
}
