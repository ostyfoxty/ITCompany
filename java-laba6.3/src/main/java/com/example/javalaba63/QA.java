package com.example.javalaba63;

import java.io.Serializable;

public class QA extends Worker implements Serializable {
    private static final long serialVersionUID = -3949314371563731193L;

    public QA(String name) {
        super(name, Type.QA);
    }

    public QA() {
        this("");
    }
}