package ru.netology.springboot2hw2;

import javax.validation.constraints.Size;

public class User {
    @Size(min = 2, max = 20)
    private String user;
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
