package com.epam.demo.core.model;

public record ImmutableUser(String username, String password) implements User {

}
