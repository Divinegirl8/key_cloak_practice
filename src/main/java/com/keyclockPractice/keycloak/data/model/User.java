package com.keyclockPractice.keycloak.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String password;
}
