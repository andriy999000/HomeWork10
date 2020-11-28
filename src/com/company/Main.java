package com.company;

public class Main {

    public static void main(String[] args) {
        Library library = new Library("Моя библиотека");


        while (true){
            int value = arrayFilmNullSearch(library.getArrayFilm());
            if (value != -1){
                library.getArrayFilm()[value] = new Film("Звёздные войны " + (value + 1),2.5,Genre.Фантастика);
            }else {
                System.out.println("Вы достигли лимита");
                break;
            }
        }


    }


    public static int arrayFilmNullSearch(Film[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }

        }
        return -1;
    }

}
