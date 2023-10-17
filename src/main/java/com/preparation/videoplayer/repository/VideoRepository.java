package com.preparation.videoplayer.repository;

import com.preparation.videoplayer.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
