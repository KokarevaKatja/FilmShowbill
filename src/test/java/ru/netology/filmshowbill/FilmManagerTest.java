package ru.netology.filmshowbill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmItem item1 = new FilmItem(1, "Бладшот", "боевик", 2020);
    FilmItem item2 = new FilmItem(2, "Вперед", "мультфильм", 2019);
    FilmItem item3 = new FilmItem(3, "Отель Белград", "комедия", 2021);
    FilmItem item4 = new FilmItem(4, "Джентельмены", "боевик", 2020);
    FilmItem item5 = new FilmItem(5, "Человек-невидимка", "ужасы", 2019);
    FilmItem item6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм", 2021);
    FilmItem item7 = new FilmItem(7, "Номер один", "комедия", 2020);
    FilmItem item8 = new FilmItem(8, "Еще по одной", "драма/комедия", 2020);
    FilmItem item9 = new FilmItem(9, "Довод", "фантастика", 2020);
    FilmItem item10 = new FilmItem(10, "Дом Gucci", "биография", 2021);


    @Test
    public void shouldAddFourFilms() {
        FilmManager manager = new FilmManager();
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);

        FilmItem[] expected = {item6, item7, item8, item9};
        FilmItem[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNineFilms() {
        FilmManager manager = new FilmManager();
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        FilmItem[] expected = {item2, item3, item4, item5, item6, item7, item8, item9, item10};
        FilmItem[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllTen() {
        FilmManager manager = new FilmManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOne() {
        FilmManager manager = new FilmManager();
        manager.save(item1);

        FilmItem[] expected = {item1};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        FilmManager manager = new FilmManager();
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        FilmItem[] expected = {item10, item9, item8, item7, item6};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTen() {
        FilmManager manager = new FilmManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        FilmItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllSix() {
        FilmManager manager = new FilmManager(6);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}
