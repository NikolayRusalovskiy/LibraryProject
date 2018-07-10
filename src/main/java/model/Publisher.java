package main.java.model;

public class Publisher {
    private String title;
    private int yearOfCreation;
    private String city;

    @Override
    public String toString() {
        return "Publisher{" +
                "title='" + title + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", city='" + city + '\'' +
                '}';
    }

    public Publisher(String title, int yearOfCreation, String city) {
        this.title = title;
        this.yearOfCreation = yearOfCreation;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
