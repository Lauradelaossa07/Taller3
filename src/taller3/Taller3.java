/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Laura
 */
public class Taller3 {

    public static int menu(){
    int option = 0;
    do{
        option= Integer.parseInt(JOptionPane.showInputDialog("Que deseas hacer con las canciones a continuacion:\n\n"
                                                             +"1 Crear PlayList\n"
                                                             +"2 Filtrar por genero\n"
                                                             +"3 Filtrar por año\n"
                                                             +"4 Mostrar las lista de canciones\n"
                                                             +"5 Salir"
                                                             +"\n Seleccione una opción del 1 al 5"));
    }while(option <= 0 || option >5);
    return option;
    }

    static void listOption(ArrayList<Song> song){
        int x = 0;
        ArrayList list = new ArrayList();
        
        while(x<6){
            if(x<6){
                for(int i = 0; i < song.size(); i++){
                    System.out.println(i+""+song);
                }
            }
            
            Scanner consol = new Scanner(System.in);
            System.out.println("Elige la musica a agregar en tu PlayList");           
            x = Integer.parseInt(consol.nextLine());
            
            switch(x){
                case 1:
                    list.add(song);             
                case 2:
                    list.add(song);
                case 3:
                    list.add(song);
                case 4:
                    list.add(song);
                case 5:
                    list.add(song);
                case 6:
                    list.add(song);
                default :
                    System.out.println("Programa finalizado");
            }
        }
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int option;
        
        
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
            option =menu();
//            System.out.println("choose one of the options: ");
//            System.out.println("\n");
//            System.out.println("1. Escriba el genero que desea consultar"+"\npop"+"\nrock"+"\nJazz");
//            System.out.println("\n");
//            System.out.println("2. Filtar por año, ingresa el año: 2013,2014,2015,2016,2017,2018");
//            System.out.println("3.Mostar lista de canciones: ");
//            System.out.println("4.Exit ");
            
            switch (option){
                case 1:
                    break;
                case 2:
                    System.out.println("1. Escriba el genero que desea consultar"+"\npop"+"\nrock"+"\nJazz");
                    String genre = console.next();
                    System.out.println("Las canciones filtradas por el genero "+genre+" son:");
                    collection.SearchGenre(genre);
                    break;
                case 3:
                    System.out.println("2. Filtar por año, ingresa el año: 2013,2014,2015,2016,2017,2018");
                    int date = console.nextInt();
                    System.out.println("Las canciones filtradas por el año "+date+" son:");
                    collection.Year(date);
                    break;
                case 4:
                    System.out.println("3. Mostar lista de canciones: ");
                    System.out.println(" SONGS ");
                    collection.ViewSong();
                    break;
            }
        }
        while(option !=5);

    }

}
