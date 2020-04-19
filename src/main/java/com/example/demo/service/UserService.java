package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static List<User> users = new ArrayList<>();

    static {
        for (int i = 1; i < 11; i++) {
            User user = new User();
            user.setId(i);
            user.setAddress("陕西省西安市华诚国际" + i + "号楼");
            user.setPhone("13488880000");
            user.setEmail("123@qq.com");
            user.setUsername("Robert");
            users.add(user);
        }

    }

    public List<User> getAllUsers() {
        return users;
    }

    public void deleteUser(int id) {
        UserService.users.removeIf(user -> user.getId() == id);
    }

    public void addUser(User user) {
        user.setId(users.size() + 1);
        users.add(0, user);
    }

    public void editUser(User user) {
        for (User tempUser : users) {
            if (tempUser.getId() == user.getId()) {
                tempUser.setUsername(user.getUsername());
                tempUser.setEmail(user.getEmail());
                tempUser.setPhone(user.getPhone());
                tempUser.setAddress(user.getAddress());
                break;
            }
        }
    }
}
