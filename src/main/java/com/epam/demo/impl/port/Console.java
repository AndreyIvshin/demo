package com.epam.demo.impl.port;

import java.util.List;

public interface Console {

    List<String> args();

    void print(String message);
}
