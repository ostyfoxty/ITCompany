package com.example.javalaba63;

import java.io.Serializable;
import java.util.Date;

public class Designer extends Worker implements Serializable {
    private static final long serialVersionUID = -3949314371553731793L;

    public Designer(String name) {
        super(name, Type.DESIGNER);
    }

    public Designer() {
        this("");
    }
}