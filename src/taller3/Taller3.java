/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 * importaciones de librerias usadas en el programa
 */

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.List;

/**
 * El objetivo principal de la clase es llamar los metodos de las otras clases,
 * permitir crear instancias de las clases y ejecutar el programa para comprobar
 * su funcionalida
 * @author Jonathan Emilio Brito Avilez
 * @author Laura
 */
public class Taller3 {
    
    /**
     * Metodo creado para mostrar un menu en el cual el usuario eligira la 
     * accion que desea llevar acabo
     * @return 
     */
    
    public static int menu(){
    int option = 0;
    do{
        option= Integer.parseInt(JOptionPane.showInputDialog("Que deseas hacer con las canciones a continuacion:\n\n"
                                                             +"1 Crear PlayList\n"
                                                             +"2 Filtrar por genero\n"
                                                             +"3 Filtrar por año\n"
                                                             +"4 Salir"
                                                             +"\n Seleccione una opción del 1 al 4"));
    }while(option <= 0 || option >5);
    return option;
    }
    
    /**
     * Metodo creado con el fin de recorrer el ArrayList, obtener los datos del mismo
     * y agregar una cancion dependiendo de la opcion ingresada por el usuario
     * @param collection contiene la informacion del ArrayList
     */
    
        static void listOption(SongCollection[] collection){
        int x = 0;
        ArrayList list = new ArrayList();
        
        while(x<6){
            if(x<6){
                for(int i = 0; i < collection.length; i++){
                    System.out.println(i+" "+collection[i].title);
                }
            }
            
            Scanner consol = new Scanner(System.in);
            System.out.println("Elige la musica a agregar en tu PlayList");           
            x = Integer.parseInt(consol.nextLine());
            
            switch(x){
                case 1:
                    list.add(collection[0].title);
                    break;
                case 2:
                    list.add(collection[1].title);
                    break;
                case 3:
                    list.add(collection[2].title);
                    break;
                case 4:
                    list.add(collection[3].title);
                    break;
                case 5:
                    list.add(collection[4].title);
                    break;
                case 6:
                    list.add(collection[5].title);
                    break;
                default :
                    System.out.println("Programa finalizado");
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        SongCollection collection[] = new SongCollection[6];
        FilterSong filter = new FilterSong();
        ArrayList<SongCollection> SongF = new ArrayList();
        int option;
       
        collection[0] = new SongCollection("love", 1, 2017, (float) 3.5, "pop", "cancion");
        collection[1] = new SongCollection("bad", 2, 2016, (float) 4.5, "pop", "cancion del año");
        collection[2] = new SongCollection("happy", 3, 2015, (float) 4.1, "rock", "premio gramy");
        collection[3] = new SongCollection("make ", 4, 2013, (float) 4.5, "rock", "cancion del año");
        collection[4] = new SongCollection("happy", 5, 2018, (float) 2.5, "jazz", "premio gramy");
        collection[5] = new SongCollection("make ", 6, 2014, (float) 4.9, "jazz", "cancion del año");
        
        SongF.add(collection[0]);
        SongF.add(collection[1]);
        SongF.add(collection[2]);
        SongF.add(collection[3]);
        SongF.add(collection[4]);
        SongF.add(collection[5]);
        
        filter.FilterYearDuration(SongF);
        
        do
        {
            option =menu();
            
            switch (option){
                case 1:
                    listOption(collection);
                    break;
                case 2:
                    System.out.println("Escriba el genero que desea consultar\n"
                                       +"pop\n"
                                       +"rock\n"
                                       +"Jazz");
                    String genre = console.next();
                    System.out.println("Las canciones filtradas por el genero "+genre+" son:");
                    List<SongCollection> Listfilter = filter.FilterGenre(collection, genre);
                    for(int i = 0; i<Listfilter.size();i++){
                        System.out.println(Listfilter.get(i).title);
                    }
                    break;
                case 3:
                    System.out.println("Filtar por año, ingresa el año: 2013,2014,2015,2016,2017,2018");
                    int date = console.nextInt();
                    System.out.println("Las canciones filtradas por el año "+date+" son:");
                    List<SongCollection> ListFilter = filter.FilterYear(collection, date);
                    for(int i = 0; i<ListFilter.size();i++){
                        System.out.println(ListFilter.get(i).title);
                    }
                    break;
            }
        }
        while(option !=4);
    }
}