package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeight;
    private double stampWight;
    private boolean isStamped;

    public Stamp(String stampName, double stampHeight, double stampWight, boolean isStamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWight = stampWight;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public double getStampWight() {
        return stampWight;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeight, stampHeight) == 0 && Double.compare(stamp.stampWight, stampWight) == 0 && isStamped == stamp.isStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWight, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWight=" + stampWight +
                ", isStamped=" + isStamped +
                '}';
    }
}
