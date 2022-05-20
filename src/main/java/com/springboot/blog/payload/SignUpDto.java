package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class SignUpDto {
    @NotEmpty
    private String name;
    @NotEmpty
    @Size(min=5, message = "Username should have at least 5 characters")
    private String username;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min=8, message = "Password should have at least 8 characters")
    private String password;
}
