package com.epam.demo.api;

import com.epam.demo.core.service.HelpMessage;
import com.epam.demo.impl.port.Console;

public class HelpCommand implements Command {
    private final Console console;
    private final HelpMessage helpMessage;

    public HelpCommand(final Console console, final HelpMessage helpMessage) {
        this.console = console;
        this.helpMessage = helpMessage;
    }

    @Override
    public void execute() {
        console.print(helpMessage.get());
    }
}
