package com.pepit.model;

import com.pepit.enumeration.TypeAlertEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Filter")
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    private User users;

    @Column(name = "alertType")
    TypeAlertEnum alertType;

    @ElementCollection
    @Column(name = "criterias")
    Map<ModelProperty, String> criterias;

    @OneToMany
    List<Alert> alerts;

    @Column(name = "isEmail")
    boolean isEmail;

    @Column(name = "isAlert")
    boolean isAlert;

    @CreatedDate
    @Column(name = "createdat")
    LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updatedat")
    LocalDateTime updatedAt;
}