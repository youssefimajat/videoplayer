package com.preparation.videoplayer.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String title;

    @OneToMany
    private List<Video> videos;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
