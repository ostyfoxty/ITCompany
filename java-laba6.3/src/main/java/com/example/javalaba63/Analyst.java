package com.example.javalaba63;

import java.io.Serializable;

public class Analyst extends Worker implements Serializable {
    private static final long serialVersionUID = -3949314371553731193L;

    public Analyst(String name) {
        super(name, Type.ANALYST);
    }

    public Analyst() {
        this("");
    }
}