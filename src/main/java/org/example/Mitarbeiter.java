package org.example;

public class Mitarbeiter {
    private String name;

    public Mitarbeiter(String name){
        setname(name);
    }

    public void setname(String name){
        if (name != null){
            this.name = name;
        }
    }
}
