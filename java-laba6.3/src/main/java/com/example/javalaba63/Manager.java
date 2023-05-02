package com.example.javalaba63;

import java.io.Serializable;

public class Manager extends Worker implements Serializable {
    private static final long serialVersionUID = -3949314371567731193L;

    public Manager(String name) {
        super(name, Type.MANAGER);
    }

    public Manager() {
        this("");
    }
}