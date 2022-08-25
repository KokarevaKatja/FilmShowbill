package ru.netology.filmshowbill;

public class FilmManager {

    private FilmItem[] films = new FilmItem[0];
    private int limit;

    public FilmManager() {
        limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;

        films = tmp;
    }

    public FilmItem[] getFilms() {
        return films;
    }

    public FilmItem[] findAll() {
        return films;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}
