package com.gamingservice.dtos.user;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserAuthDto {

    private String login;
    private String password;


}
