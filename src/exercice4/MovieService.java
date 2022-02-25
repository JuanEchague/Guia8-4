/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4;

import comparators.CompareDirector;
import comparators.CompareDurationAsc;
import comparators.CompareDurationDesc;
import comparators.CompareTitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class MovieService {
    private ArrayList<Movie> movieList;
    private Scanner read;

    public MovieService() {
        movieList = new ArrayList<>();
        read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }
    
    public void createMovie(){
        Movie movie = new Movie();
        System.out.print("Enter the name of the movie: ");
        movie.setTitle(read.next());
        System.out.print("Enter the name of the director: ");
        movie.setDirector(read.next());
        System.out.print("Enter the duration in minutes: ");
        movie.setDuration(read.nextInt());
        addMovie(movie);
    }
    
    public void addMovie(Movie movie){
        movieList.add(movie);
    }
    
    public void printList(){
        
        for (Movie movie: movieList){
            System.out.println(movie);
        }    
    }
    
    public void printOneHourList(){
   
        for (Movie movie : movieList){
            if (movie.getDuration()>= 60){ 
                System.out.println(movie);
            }
        }
    }

    public void sortByDurationAsc(){
        CompareDurationAsc comparation = new CompareDurationAsc();
        Collections.sort(movieList, comparation);
        printList();
    }

    public void sortByDurationDesc(){
        CompareDurationDesc comparacion = new CompareDurationDesc();
        Collections.sort(movieList, comparacion);
        printList();
    }
    
    public void sortByTitle(){
        CompareTitle comparation = new CompareTitle();
        Collections.sort(movieList, comparation);
        printList();
    }
    
    public void sortByDirector(){
        CompareDirector comparation = new CompareDirector();
        Collections.sort(movieList, comparation);
        printList();

    }
}
