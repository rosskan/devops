package com.nexify.webapp.models;

public class Greeting {

    // I like to mark instance parameters that will not be set via any other means but during initialization as final, to express the intention
    private final String name;

    public Greeting(String name) {
        this.name  = name;
    }

    public String getGreeting() {
        return "Hello 123:" + name;
    }
}
