package com.web.movieTheater.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "photo")
    private String photo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_state_id")
    private MovieState movieState;
    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<VideoSession> videoSessions = new HashSet<>();

    public Set<VideoSession> getVideoSessions() {
        return videoSessions;
    }

    public void setVideoSessions(Set<VideoSession> videoSessions) {
        this.videoSessions = videoSessions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public MovieState getMovieState() {
        return movieState;
    }

    public void setMovieState(MovieState movieState) {
        this.movieState = movieState;
    }
}
