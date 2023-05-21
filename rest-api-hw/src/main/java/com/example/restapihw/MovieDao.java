package com.example.restapihw;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
@Component
public class MovieDao {
    private List<MoviePersisted> movies;

    public MovieDao() {
        this.movies = new ArrayList<>();
    }

    public Movie createMovie(Movie movie) {
        this.movies.add(new MoviePersisted(movie.getName(), movie.getGen(), movie.getYear(), movie.getDirector(), new Random().nextLong()));
        return movie;
    }

    public Movie getMovieById(long id) {
        for (MoviePersisted moviePersisted : this.movies) {
            if (moviePersisted.getId() == id) {
                return moviePersisted.toMovie();
            }
        }
        return null;
    }

    public Movie updateMovie(long id, @RequestBody Movie updatedMovie) {
        for (MoviePersisted moviePersisted : this.movies) {
            if (moviePersisted.getId() == id) {
                moviePersisted.setName(updatedMovie.getName());
                return moviePersisted.toMovie();
            }
        }
        return null;
    }


    public boolean deleteMovie (long id){
        for(int i=0; i<this.movies.size(); i++) {
            if(this.movies.get(i).getId()== id){
                return this.movies.remove(this.movies.get(i));
            }
        }
        return false;
    }


    public List<MoviePersisted> getMovie() {
       return this.movies;
    }


}
