package com.epam.demo.core.service;

public class SimpleHelpMessage implements HelpMessage {

    @Override
    public String get() {
        return "Available options are: help, list-users";
    }
}
