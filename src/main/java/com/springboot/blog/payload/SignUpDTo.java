package com.springboot.blog.payload;

import lombok.Data;

@Data
public class SignUpDTo {
    private String name;
    private String username;
    private String email;
    private String password;
}
