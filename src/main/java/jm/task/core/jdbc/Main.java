package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Tom", "Tomov", (byte) 31);
        userService.saveUser("Mike", "Mikov", (byte) 19);
        userService.saveUser("Bob", "Bobov", (byte) 24);
        userService.saveUser("Katy", "Tomova", (byte) 28);

        List<User> users = userService.getAllUsers();
        for(User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
