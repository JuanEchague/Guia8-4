/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import exercice4.Movie;
import java.util.Comparator;

/**
 *
 * @author dark_
 */
public class CompareDurationAsc implements Comparator<Movie> {
    @Override
    public int compare(Movie movieA, Movie movieB) {
        if (movieA.getDuration() > movieB.getDuration()){
            return -1;
        } else if (movieA.getDuration() < movieB.getDuration()){
            return 1;
        } else {
            return 0;
        }
    }
}
