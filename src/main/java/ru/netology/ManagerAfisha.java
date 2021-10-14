package ru.netology;


public class ManagerAfisha {

    private Film[] films = new Film[0];
    int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Film[] getFilms() {
        return films;
    }

    public void setFilms(Film[] films) {
        //this.films = films;
    }

    public ManagerAfisha(int limit) {
        this.limit = limit;
    }

    public ManagerAfisha() {
    }

    public void add(Film film) {
        int length = films.length + 1;
        Film[] newFilms = new Film[length];
        for (int i = 0; i < films.length; i++) {
            newFilms[i] = films[i];
        }
        int lastIndex = newFilms.length - 1;
        newFilms[lastIndex] = film;
        films = newFilms;

    }

    public Film[] getAll() {

        int length = films.length;

        if (length > 10) {
            length = films.length - 1;
        } else {
            length = limit;
        }

            Film[] newFilms = new Film[length];

            for (int i = 0; i < newFilms.length; i++) {

                newFilms[i] = films[i];
                int index = films.length - i - 1;

                newFilms[i] = films[index];
            }

            return newFilms;
        }
    }





