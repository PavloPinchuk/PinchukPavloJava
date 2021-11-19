package com.univ;

public class Book {
    private String avtor;
    private String name;
    private int year;

    public Book(String avtor, String name, int year) {
        this.avtor = avtor;
        this.name = name;
        this.year = year;
    }

    public String getAvtor() {
        return avtor;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
