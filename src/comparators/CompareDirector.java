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
public class CompareDirector implements Comparator<Movie>{
      @Override
    public int compare(Movie movieA, Movie movieB) {
        return movieA.getDirector().compareTo(movieB.getDirector());
    }
    
}
