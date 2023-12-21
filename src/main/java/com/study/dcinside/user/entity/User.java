package com.study.dcinside.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "TB_USER")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String checkPassword;

    @Column(nullable = false)
    private String email;

    @Column
    private String imageName;

    @Column
    private String imagePath;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Builder
    public User(final String username, final String password, final String checkPassword, final String email, final UserRole role, final String imageName, final String imagePath) {
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.email = email;
        this.role = role;
        this.imageName = imageName;
        this.imagePath = imagePath;
    }

    public void uploadImage(final String imageName, final String imagePath) {
        this.imageName = imageName;
        this.imagePath = imagePath;
    }

    public void deleteImage() {
        imageName = null;
        imagePath = null;
    }

}
