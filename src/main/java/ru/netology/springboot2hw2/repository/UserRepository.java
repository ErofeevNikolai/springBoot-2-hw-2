package ru.netology.springboot2hw2.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springboot2hw2.Authorities;
import ru.netology.springboot2hw2.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private static ConcurrentHashMap<User, List<Authorities>> baseUsers = new ConcurrentHashMap<>();
    public List<Authorities> getUserAuthorities(User user) {
        return baseUsers.get(user);
    }

    public static boolean checkUser(User user){
        return baseUsers.containsKey(user);
    }
}