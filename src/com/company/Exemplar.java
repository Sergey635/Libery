package com.company;

import java.util.Objects;

public class Exemplar {
    private String id;
    private Edition edition;
    private int shelfNumber;
    private int polkaNumber;
    private double potrepanost;

    public Exemplar() {
    }

    public Exemplar(Edition edition, int shelfNumber, int polkaNumber, double potrepanost) {
        this.edition = edition;
        this.shelfNumber = shelfNumber;
        this.polkaNumber = polkaNumber;
        this.potrepanost = potrepanost;
    }

    public Exemplar(String id, Edition edition, int shelfNumber, int polkaNumber, double potrepanost) {
        this.id = id;
        this.edition = edition;
        this.shelfNumber = shelfNumber;
        this.polkaNumber = polkaNumber;
        this.potrepanost = potrepanost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getPolkaNumber() {
        return polkaNumber;
    }

    public void setPolkaNumber(int polkaNumber) {
        this.polkaNumber = polkaNumber;
    }

    public double getPotrepanost() {
        return potrepanost;
    }

    public void setPotrepanost(double potrepanost) {
        this.potrepanost = potrepanost;
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "id='" + id + '\'' +
                ", edition=" + edition +
                ", shelfNumber=" + shelfNumber +
                ", polkaNumber=" + polkaNumber +
                ", potrepanost=" + potrepanost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exemplar exemplar = (Exemplar) o;
        return getId().equals(exemplar.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
