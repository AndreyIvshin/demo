package com.epam.demo.impl.port;

import java.util.List;

import com.epam.demo.core.model.User;

public interface UserStorage {

    List<User> users();
}
