/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4;

/**
 *
 * @author dark_
 */
public class Movie {

    //////////////////////////////Atributes/////////////////////////////////////
    private String title;
    private String director;
    private int duration;

    public Movie() {
    }

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        return String.format("Movie: (Title: %s, Director: %s, Duration, %s)", title,director,duration);
    }

}
