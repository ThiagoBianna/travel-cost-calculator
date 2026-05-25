// This file was developed with assistance from Gemini to refine logic, fix bugs, and refactor variable names,
// in accordance with CS50's academic honesty guidelines regarding AI tools.
package com.VaiDarQuanto.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
}