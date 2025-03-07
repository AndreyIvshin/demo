package com.epam.demo.api;

import com.epam.demo.core.model.User;
import com.epam.demo.core.service.UsersList;
import com.epam.demo.impl.port.Console;

public class ListUsersCommand implements Command {

    private final Console console;
    private final UsersList usersList;

    public ListUsersCommand(final Console console, final UsersList usersList) {
        this.console = console;
        this.usersList = usersList;
    }

    @Override
    public void execute() {
        usersList.get().stream().map(User::toString).forEach(console::print);
    }
}
