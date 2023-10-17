package com.preparation.videoplayer.service;


import com.preparation.videoplayer.domain.Channel;
import com.preparation.videoplayer.domain.Video;
import org.springframework.stereotype.Service;

@Service
public interface ChannelService {


    Channel createChannel(Channel channel);
    Boolean deleteChannel(Long id);
    Boolean upload(Video video);
}


