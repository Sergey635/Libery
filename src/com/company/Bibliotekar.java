package com.company;

import java.util.Objects;

public class Bibliotekar {
    private String id;
    private String fillName;
    private String occupation;

    public Bibliotekar() {
    }

    public Bibliotekar(String fillName, String occupation) {
        this.fillName = fillName;
        this.occupation = occupation;
    }

    public Bibliotekar(String id, String fillName, String occupation) {
        this.id = id;
        this.fillName = fillName;
        this.occupation = occupation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFillName() {
        return fillName;
    }

    public void setFillName(String fillName) {
        this.fillName = fillName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Bibliotekar{" +
                "id='" + id + '\'' +
                ", fillName='" + fillName + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bibliotekar that = (Bibliotekar) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
