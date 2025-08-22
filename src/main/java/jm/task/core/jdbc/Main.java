package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

        // Добавление 4 пользователей
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Petr", "Petrov", (byte) 30);
        userService.saveUser("Maria", "Sidorova", (byte) 28);
        userService.saveUser("Anna", "Smirnova", (byte) 22);

        // Получение всех пользователей и вывод
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Очистка таблицы
        userService.cleanUsersTable();
        // Удаление таблицы
        userService.dropUsersTable();
    }
}