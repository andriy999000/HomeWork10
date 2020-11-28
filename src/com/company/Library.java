package com.company;

import java.sql.SQLOutput;

public class Library {
    private Film[] arrayFilm;
    private final String name;

    {
        arrayFilm = new Film[5];
        arrayFilm[0] = new Film("Первому игроку приготовиться",2.1,Genre.Фантастика);
        arrayFilm[1] = new Film("Гарри потер",2.3,Genre.Фантастика);
        System.out.println("Добавлены любимые фильмы\n");
    }

    public Library(String name) {
        this.name = name;
        System.out.println("Библиотека \""+ name +"\", успешно создана.");
    }

    public Film[] getArrayFilm() {
        return arrayFilm;
    }
}
