package com.epam.demo.api;

import java.util.Map;

import com.epam.demo.impl.port.Console;

public class MainCommand implements Command {

    private final Console console;
    private final Map<String, Command> commands;

    public MainCommand(final Console console, final Map<String, Command> commands) {
        this.console = console;
        this.commands = commands;
    }

    @Override
    public void execute() {
        final var arg = console.args().get(0);
        commands.get(arg).execute();
    }
}
