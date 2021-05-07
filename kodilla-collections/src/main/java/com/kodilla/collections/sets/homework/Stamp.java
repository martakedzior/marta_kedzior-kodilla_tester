package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double size;
    private Boolean isStamped;

    public Stamp(String name, double size, Boolean isStamped) {
        this.name = name;
        this.size = size;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public Boolean getIsStamped() {
        return isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isStamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.size, size) == 0 && Objects.equals(name, stamp.name) && Objects.equals(isStamped, stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, isStamped);
    }
}
