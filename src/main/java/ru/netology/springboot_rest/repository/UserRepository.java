package ru.netology.springboot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springboot_rest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("guest") && password.equals("222")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
