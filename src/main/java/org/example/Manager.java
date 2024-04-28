package org.example;

public class Manager extends Mitarbeiter{


    private float fixum;
    public Manager(String name) {
        super(name);
        setFixum(fixum);
    }

    private void setFixum(float fixum) {
        this.fixum = fixum;
    }


    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

    }

}
