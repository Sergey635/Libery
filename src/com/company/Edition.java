package com.company;

import java.util.Objects;

public class Edition {
    private String id;
    private String name;
    private String autor;
    private String publichingHouse;
    private int pages;
    private Genre genre;

    public Edition() {
    }

    public Edition(String name, String autor, String publichingHouse, int pages, Genre genre) {
        this.name = name;
        this.autor = autor;
        this.publichingHouse = publichingHouse;
        this.pages = pages;
        this.genre = genre;
    }

    public Edition(String id, String name, String autor, String publichingHouse, int pages, Genre genre) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.publichingHouse = publichingHouse;
        this.pages = pages;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublichingHouse() {
        return publichingHouse;
    }

    public void setPublichingHouse(String publichingHouse) {
        this.publichingHouse = publichingHouse;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Edition{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", publichingHouse='" + publichingHouse + '\'' +
                ", pages=" + pages +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edition edition = (Edition) o;
        return getId().equals(edition.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
