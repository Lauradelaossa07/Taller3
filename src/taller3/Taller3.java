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
        Scanner opc = new Scanner(System.in);
        int opcion;
        
        
        SongCollection collection = new SongCollection();
        collection.AddSong("love", 1, 2017, (float) 3.5, "pop", "cancion");
        collection.AddSong("bad", 2, 2016, (float) 4.5, "pop", "cancion del año");
        collection.AddSong("happy", 3, 2015, (float) 4.1, "rock", "premio gramy");
        collection.AddSong("make ", 4, 2013, (float) 4.5, "rock", "cancion del año");
        collection.AddSong("happy", 5, 2018, (float) 2.5, "jazz", "premio gramy");
        collection.AddSong("make ", 6, 2014, (float) 4.9, "jazz", "cancion del año");
        

       
       //System.out.println("De cual genero deseas ver"+"\npop"+"\nrock");
       //String genre = console.next();
       //System.out.println("Las canciones filtradas por el genero "+genre+" son:");
       //collection.SearchGenre(genre);
       // System.out.println("\n\nDe cual año deseas ver"+"\n2019"+"\n2016"+"\n2015"+"\n2013"+"\n2020"+"\n2014");
       //int date = console.nextInt();
       // System.out.println("Las canciones filtradas por el año "+date+" son:");
       //collection.Year(date);
       
          do
        {
            System.out.println("choose one of the options: ");
            System.out.println("\n");
            System.out.println("1. Escriba el genero que desea consultar"+"\npop"+"\nrock"+"\nJazz");
            System.out.println("\n");
            System.out.println("2. Filtar por año, ingresa el año: 2013,2014,2015,2016,2017,2018");
            System.out.println("3.Mostar lista de canciones: ");
            System.out.println("4.Exit ");
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                     String genre = console.next();
                     System.out.println("Las canciones filtradas por el genero "+genre+" son:");
                     collection.SearchGenre(genre);
                    break;
                case 2:
                     int date = console.nextInt();
                     System.out.println("Las canciones filtradas por el año "+date+" son:");
                    collection.Year(date);
                    break;
                case 3:
                     System.out.println(" SONGS ");
                     collection.ViewSong();
                    break;
            }
        }
        while(opcion !=4);

    }
    
}
