package com.gamingservice.models;

import lombok.Data;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    private String login;

    @NotBlank
    @Setter
    private String password;

    @Email
    private String email;

    public User(@NotBlank String login, @NotBlank String password, @Email String email) {
        this.login = login;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
        this.email = email;
    }

    public User() { }


}
