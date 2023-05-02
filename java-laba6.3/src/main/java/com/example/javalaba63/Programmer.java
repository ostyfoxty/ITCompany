package com.example.javalaba63;

import java.io.Serializable;

public class Programmer extends Worker implements Serializable {
    private static final long serialVersionUID = -3949314371553732293L;

    public Programmer(String name) {
        super(name, Type.PROGRAMMER);
    }

    public Programmer() {
        this("");
    }
}