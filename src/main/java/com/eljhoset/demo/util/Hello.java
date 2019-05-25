package com.eljhoset.demo.util;

/**
 *
 * @author Daniel
 */
public class Hello {

    public String hello() {
        return "Hi";
    }

    public String hello(String name) {
        return String.format("Hi %s", name);
    }
}
