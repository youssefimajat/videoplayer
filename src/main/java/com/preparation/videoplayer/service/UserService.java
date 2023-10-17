package com.preparation.videoplayer.service;


import org.springframework.stereotype.Service;



@Service
public interface UserService {
    Boolean signIn();
    Boolean register();
    Boolean signOut();
}
