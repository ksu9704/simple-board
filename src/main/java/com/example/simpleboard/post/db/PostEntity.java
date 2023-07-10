package com.example.simpleboard.post.db;

import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String boardId;

    private String userName;

    private String password;

    private String email;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime postedAt;



}
