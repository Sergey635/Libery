package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private String id;
    private String name;
    private String lastName;
    private String patronimic;
    private LocalDate birthday;
    private int numberPhone;
    private String adress;

    public Client() {
    }

    public Client(String name, String lastName, String patronimic, LocalDate birthday, int numberPhone, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.patronimic = patronimic;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
        this.adress = adress;
    }

    public Client(String id, String name, String lastName, String patronimic, LocalDate birthday, int numberPhone, String adress) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronimic = patronimic;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
        this.adress = adress;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", birthday=" + birthday +
                ", numberPhone=" + numberPhone +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getId().equals(client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
