package com.company;

import java.util.Objects;

public class Setings {
    private String id;
    private int timeMax;
    private int minAge;
    private int maxBooks;
    private int maxExemplar;
    private int maxReadingHolle;
    private int minDamage;

    public Setings() {
    }

    public Setings(int timeMax, int minAge, int maxBooks, int maxExemplar, int maxReadingHolle, int minDamage) {
        this.timeMax = timeMax;
        this.minAge = minAge;
        this.maxBooks = maxBooks;
        this.maxExemplar = maxExemplar;
        this.maxReadingHolle = maxReadingHolle;
        this.minDamage = minDamage;
    }

    public Setings(String id, int timeMax, int minAge, int maxBooks, int maxExemplar, int maxReadingHolle, int minDamage) {
        this.id = id;
        this.timeMax = timeMax;
        this.minAge = minAge;
        this.maxBooks = maxBooks;
        this.maxExemplar = maxExemplar;
        this.maxReadingHolle = maxReadingHolle;
        this.minDamage = minDamage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTimeMax() {
        return timeMax;
    }

    public void setTimeMax(int timeMax) {
        this.timeMax = timeMax;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

    public int getMaxExemplar() {
        return maxExemplar;
    }

    public void setMaxExemplar(int maxExemplar) {
        this.maxExemplar = maxExemplar;
    }

    public int getMaxReadingHolle() {
        return maxReadingHolle;
    }

    public void setMaxReadingHolle(int maxReadingHolle) {
        this.maxReadingHolle = maxReadingHolle;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    @Override
    public String toString() {
        return "Setings{" +
                "id='" + id + '\'' +
                ", timeMax=" + timeMax +
                ", minAge=" + minAge +
                ", maxBooks=" + maxBooks +
                ", maxExemplar=" + maxExemplar +
                ", maxReadingHolle=" + maxReadingHolle +
                ", minDamage=" + minDamage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Setings setings = (Setings) o;
        return getId().equals(setings.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
