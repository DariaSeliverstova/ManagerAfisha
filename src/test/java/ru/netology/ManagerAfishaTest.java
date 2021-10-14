package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerAfishaTest {

    
    @Test
    public void ShouldFilm() {
        ManagerAfisha manager = new ManagerAfisha(4);
        Film first = new Film(1, "BladShot", "thriller", 7, 1);
        Film second = new Film(2, "Privet", "camedy", 6, 2);
        Film third = new Film(3, "Hello", "drama", 5, 3);
        Film fourth = new Film(4, "Bye", "camedy", 4, 4);
        Film fifth = new Film(5, "it", "thriller", 3, 5);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldNewFilm() {
        ManagerAfisha manager = new ManagerAfisha(3);
        Film first = new Film(1, "BladShot", "thriller", 7, 1);
        Film second = new Film(2, "Privet", "camedy", 6, 2);
        Film third = new Film(3, "Hello", "drama", 5, 3);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldLastFilm() {
        ManagerAfisha manager = new ManagerAfisha();
        Film first = new Film(1, "BladShot", "thriller", 7, 1);
        Film second = new Film(2, "Privet", "camedy", 6, 2);
        Film third = new Film(3, "Hello", "drama", 5, 3);
        Film fourth = new Film(4, "Bye", "camedy", 4, 4);
        Film fifth = new Film(5, "it", "thriller", 3, 5);
        Film sixth = new Film(6, "bad boys", "camedy", 2, 6);
        Film seventh = new Film(7, "bad boys", "camedy", 1, 7);
        Film eighth = new Film(8, "007", "detective", 8, 8);
        Film ninth = new Film(9, "Miss Marple", "detective", 9, 9);
        Film tenth = new Film(10, "Merci", "drama", 12, 10);
        Film eleventh = new Film(11, "bob", "camedy", 13, 11);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void ShouldThreeFilm() {
        ManagerAfisha manager = new ManagerAfisha(3);
        Film first = new Film(1, "BladShot", "thriller", 7, 1);
        Film second = new Film(2, "Privet", "camedy", 6, 2);
        Film third = new Film(3, "Hello", "drama", 5, 3);
        Film fourth = new Film(4, "Bye", "camedy", 4, 4);
        Film fifth = new Film(5, "it", "thriller", 3, 5);
        Film sixth = new Film(6, "bad boys", "camedy", 2, 6);
        Film seventh = new Film(7, "bad boys", "camedy", 1, 7);
        Film eighth = new Film(8, "007", "detective", 8, 8);
        Film ninth = new Film(9, "Miss Marple", "detective", 9, 9);
        Film tenth = new Film(10, "Merci", "drama", 12, 10);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);



        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{tenth, ninth, eighth};
        assertArrayEquals(expected, actual);

    }

    }


