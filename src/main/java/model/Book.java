package main.java.model;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String name;

    //    private Publisher publisher;
    private String titlePublisher;
    private int yearOfCreationPublisher;
    private String cityPublisher;

    private int publishingYear;
    private int pages;
    private String genre;

    public Book(String author, String name, String titlePublisher, int yearOfCreationPublisher, String cityPublisher, int publishingYear, int pages, String genre) {
        this.author = author;
        this.name = name;
        this.titlePublisher = titlePublisher;
        this.yearOfCreationPublisher = yearOfCreationPublisher;
        this.cityPublisher = cityPublisher;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name=" + name +
                ", titlePublisher=" + titlePublisher +
                ", yearOfCreationPublisher=" + yearOfCreationPublisher +
                ", cityPublisher=" + cityPublisher +
                ", publishingYear=" + publishingYear +
                ", pages=" + pages +
                ", genre=" + genre +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitlePublisher() {
        return titlePublisher;
    }

    public void setTitlePublisher(String titlePublisher) {
        this.titlePublisher = titlePublisher;
    }

    public int getYearOfCreationPublisher() {
        return yearOfCreationPublisher;
    }

    public void setYearOfCreationPublisher(int yearOfCreationPublisher) {
        this.yearOfCreationPublisher = yearOfCreationPublisher;
    }

    public String getCityPublisher() {
        return cityPublisher;
    }

    public void setCityPublisher(String cityPublisher) {
        this.cityPublisher = cityPublisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
