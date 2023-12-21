package com.study.dcinside.post.entity;

import com.study.dcinside.post.dto.request.PostRequestDto;
import com.study.dcinside.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @Builder
    public Post(final String title, final String content, final User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

//    @OneToMany(mappedBy = "post")
//    private final List<Comment> comments = new ArrayList<>();

    public void updatd(PostRequestDto postRequestDto) {
        this.title = postRequestDto.getTitle();
        this.content = postRequestDto.getContent();
    }
}
