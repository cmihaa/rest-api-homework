package com.example.restapihw;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class MoviePersisted {
    private String name;
    private Movie.GenFilm gen;
    private int year;
    private String director;
    private long id;



    public MoviePersisted (String name, Movie.GenFilm gen, int year, String director, long id){
        this.name = name;
        this.gen = gen;
        this.year = year;
        this.director = director;
        this.id = id;
    }

public Movie toMovie(){
        return new Movie( this.name, this.gen, this.year, this.director);
}

    public boolean equals (Object object){
        if(object == null || this.getClass()!=object.getClass()){
            return false;
        }

        MoviePersisted toCompare = (MoviePersisted) object;
        return this.name.equals(toCompare.name) && this.director.equals(toCompare.director);
    }
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
