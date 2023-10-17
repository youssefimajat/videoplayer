package com.preparation.videoplayer.repository;

import com.preparation.videoplayer.domain.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long> {
}
