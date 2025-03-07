package com.epam.demo.impl.adapter;

import java.util.List;

import com.epam.demo.core.model.User;
import com.epam.demo.impl.port.UserStorage;

public class RamUserStorage implements UserStorage {

    private final List<User> users;

    public RamUserStorage(final List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> users() {
        return users;
    }
}
