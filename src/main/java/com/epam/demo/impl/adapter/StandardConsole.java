package com.epam.demo.impl.adapter;

import java.io.PrintStream;
import java.util.List;

import com.epam.demo.impl.port.Console;

public class StandardConsole implements Console {

    private final List<String> args;
    private final PrintStream out;

    public StandardConsole(final List<String> args, final PrintStream out) {
        this.args = args;
        this.out = out;
    }

    @Override
    public List<String> args() {
        return args;
    }

    @Override
    public void print(final String message) {
        out.println(message);
    }
}
