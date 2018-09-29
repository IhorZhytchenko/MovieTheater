package com.web.movieTheater.repository;

import com.web.movieTheater.domain.VideoSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSessionRepository extends JpaRepository<VideoSession, Long> {

}
