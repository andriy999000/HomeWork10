package com.company;

import java.util.Scanner;

public class Film {
    private final String name;
    private final double duration;
    private final Genre genre;
    static private Scanner scanner = new Scanner(System.in);

    {
        System.out.println("Создается новый Фильм");
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public Film(String name, double duration, Genre genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        {
            System.out.println("Фильм " + name + ", успешно создан!\n");
        }
    }
}
