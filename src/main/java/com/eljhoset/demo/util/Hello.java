package com.eljhoset.demo.util;

/**
 *
 * @author Daniel
 */
public class Hello {

    public String hello() {
        return "Hello";
    }

    public String hello(String name) {
        return String.format("Hello %s", name);
    }
}
