package ru.netology.filmshowbill;

public class FilmItem {

    private int id;

    private String filmName;

    private String genre;

    private int releaseYear;

    public FilmItem(int id, String filmName, String genre, int releaseYear) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}


