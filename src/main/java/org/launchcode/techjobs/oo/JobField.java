package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    //constructor for id
    public JobField() {
        this.id = nextId;
        nextId++;
    }

    // constructor for value
    public JobField(String value) {
        this.value = value;
    }
    // getter setter for id and value
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public  String toString()  {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
