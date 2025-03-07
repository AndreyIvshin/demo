package com.epam.demo.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.epam.demo.api.Command;
import com.epam.demo.api.HelpCommand;
import com.epam.demo.api.ListUsersCommand;
import com.epam.demo.api.MainCommand;
import com.epam.demo.core.model.ImmutableUser;
import com.epam.demo.core.service.SimpleHelpMessage;
import com.epam.demo.core.service.SimpleUsersList;
import com.epam.demo.impl.adapter.RamUserStorage;
import com.epam.demo.impl.adapter.StandardConsole;

public class Configuration {

    public Command mainCommand(final String[] args) {
        final var console = new StandardConsole(Arrays.asList(args), System.out);
        return new MainCommand(
                console,
                Map.of(
                        "help", new HelpCommand(console, new SimpleHelpMessage()),
                        "list-users", new ListUsersCommand(console, new SimpleUsersList(
                                new RamUserStorage(List.of(
                                        new ImmutableUser("john", "1234"),
                                        new ImmutableUser("mike", "4321"))
                                )
                        ))
                )
        );
    }
}
