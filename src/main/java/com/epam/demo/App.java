package com.epam.demo;

import com.epam.demo.config.Configuration;

public class App {

    public static void main(String[] args) {
        final var config = new Configuration();
        final var command = config.mainCommand(args);
        command.execute();
    }
}
