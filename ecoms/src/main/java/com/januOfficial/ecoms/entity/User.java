package com.januOfficial.ecoms.entity;


import com.januOfficial.ecoms.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usre")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private  byte[] img;




}
