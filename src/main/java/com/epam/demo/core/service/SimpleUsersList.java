package com.epam.demo.core.service;

import java.util.List;

import com.epam.demo.core.model.User;
import com.epam.demo.impl.port.UserStorage;

public class SimpleUsersList implements UsersList {
    private final UserStorage userStorage;

    public SimpleUsersList(final UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public List<User> get() {
        return userStorage.users();
    }
}
