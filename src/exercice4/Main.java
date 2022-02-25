/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     MovieService list = new MovieService();
        String end= "";
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        do{
            System.out.println("Movie: ");
            list.createMovie();
            System.out.print("Do you want to enter another movie? S/N: ");
            end = read.next();
        } while (end.equalsIgnoreCase("s"));
        System.out.println("Complete list: ");
        list.printList();
        System.out.println("Movies longer than 1 hour");
        list.printOneHourList();
        System.out.println("Movies by duration in ascending order");
        list.sortByDurationAsc();
        System.out.println("Movies by duration in descending order");
        list.sortByDurationDesc();
        System.out.println("Films by director");
        list.sortByDirector();
        System.out.println("Movies by title");
        list.sortByTitle();
    }
    
}
