package com.preparation.videoplayer.service;

import com.preparation.videoplayer.domain.Video;
import org.springframework.stereotype.Service;

@Service
public interface VideoService {
    Boolean stream(Long Id);
    Boolean process(Long Id);
}
