/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;
/**
 *
 * @author Laura
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        SongCollection collection = new SongCollection();
        collection.AddSong("love", 1, 2019, (float) 3.5, "pop", "cancion");
        collection.AddSong("bad", 2, 2016, (float) 4.5, "pop", "cancion del año");
        collection.AddSong("happy", 3, 2015, (float) 4.5, "rock", "premio gramy");
        collection.AddSong("make you feel", 4, 2013, (float) 4.5, "rock", "cancion del año");
       // collection.ViewSong();
       // collection.ViewGenre();
       
       System.out.println("De cual genero deseas ver"+"\npop"+"\nrock");
       String genre = console.next();
       System.out.println("Las canciones filtradas por el genero "+genre+" son:");
       collection.SearchGenre(genre);
             
       System.out.println("\n\nDe cual año deseas ver"+"\n2019"+"\n2016"+"\n2015"+"\n2013");
       int date = console.nextInt();
       System.out.println("Las canciones filtradas por el año "+date+" son:");
       collection.Year(date);
    }
    
}
