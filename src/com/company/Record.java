package com.company;

import java.time.LocalDateTime;
import java.util.Objects;

public class Record {
    private String id;
    private LocalDateTime time;
    private Bibliotekar bibliotekar;
    private Exemplar exemplar;
    private Client client;
    private String action;

    public Record() {
    }

    public Record(LocalDateTime time, Bibliotekar bibliotekar, Exemplar exemplar, Client client, String action) {
        this.time = time;
        this.bibliotekar = bibliotekar;
        this.exemplar = exemplar;
        this.client = client;
        this.action = action;
    }

    public Record(String id, LocalDateTime time, Bibliotekar bibliotekar, Exemplar exemplar, Client client, String action) {
        this.id = id;
        this.time = time;
        this.bibliotekar = bibliotekar;
        this.exemplar = exemplar;
        this.client = client;
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Bibliotekar getBibliotekar() {
        return bibliotekar;
    }

    public void setBibliotekar(Bibliotekar bibliotekar) {
        this.bibliotekar = bibliotekar;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", bibliotekar=" + bibliotekar +
                ", exemplar=" + exemplar +
                ", client=" + client +
                ", action='" + action + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return getId().equals(record.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
