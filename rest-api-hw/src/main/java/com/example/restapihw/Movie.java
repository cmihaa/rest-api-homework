package com.example.restapihw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter @AllArgsConstructor
public class Movie {
     private String name;
     private GenFilm gen;
     private int year;
     private String director;

    enum GenFilm {
        ACTIUNE,
        COMEDIE,
        DRAMA,
        HORROR,
        SF,
        FANTASY,
        ANIMATIE,
        ROMANTIC,
        DOCUMENTAR
    }
}
