package com.example.javalaba63;


import java.io.Serializable;
import java.util.Date;


public class Worker implements Serializable {
    private static final long serialVersionUID = -4741267363448938757L;
    public static Date creationDate ;
    private String name;
    private Type type;
    private String info = "";

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCreationDate(Date creation){this.creationDate = creation;}

    public String toString() {
        return this.name+": "+this.info+"     ";
    }

    protected Worker(String name, Type type) {
        this.name = name;
        this.type = type;
        this.creationDate=new Date();
    }

    public enum Type {
        QA,
        PROGRAMMER,
        MANAGER,
        ANALYST,
        DESIGNER;

        Type() {
        }
    }
}
