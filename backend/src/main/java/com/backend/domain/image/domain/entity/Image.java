package com.backend.domain.image.domain.entity;

import javax.persistence.*;

import com.backend.domain.moment.domain.entity.Moment;
import com.backend.domain.user.domain.entity.User;
import com.backend.global.domain.basetime.domain.entity.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Entity // This tells Hibernate to make a table out of this class
public class Image extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "moment_id")
    private Moment moment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(length = 300, nullable = false)
    private String path;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    public void deleteImage() {
        this.isDeleted = true;
    }
    @Builder
    public Image(Moment moment, String path) {
        this.moment = moment;
        this.path = path;
    }

    @Builder
    public Image(User user, String path) {
        this.user = user;
        this.path = path;
    }
}
