package com.pepit.model;

import com.pepit.constants.TypeAlertEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Filter")
@Transactional
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    private User users;

    @Column(name = "alertType")
    TypeAlertEnum alertType;

    @Column(name = "category")
    String category;

    @ElementCollection
    @Column(name = "criterias")
    Map<ModelProperty, String> criterias;

    @Column(name = "orderBy")
    String orderBy;

    @Column(name = "isEmail")
    boolean isEmail;

    @Column(name = "isAlert")
    boolean alert;

    @CreatedDate
    @Column(name = "createdat")
    LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updatedat")
    LocalDateTime updatedAt;

    public void update() {
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

}
