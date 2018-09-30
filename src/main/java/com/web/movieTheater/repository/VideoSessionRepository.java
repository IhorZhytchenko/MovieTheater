package com.web.movieTheater.repository;

import com.web.movieTheater.domain.VideoSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VideoSessionRepository extends JpaRepository<VideoSession, Long> {
    @Query(nativeQuery = true, value ="select * from video_session where movie_id = :movieId and start > :curentDate")
    List<VideoSession> getAllByMovieId(@Param("movieId") Long movieId, @Param("curentDate")LocalDateTime curentDate);
}
