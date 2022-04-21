/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public class FilterSong implements ISong{
    
/**
 * Implementacion del metodo FiltrarGenerso en el cual le ponemos los parametros Lista y Genero
 * llamamos Album como vector luego se crea un for el cual me va recorrer el vector Album
 * una vez termine de recorrerlo va hacer una comparacion de lista en la posicion i con el parametro
 * Genero ignorandome los mayusculas y minisculas una vez la comparacion sea verdadera mostrara
 * mostrara todos los albunes del genero comparado 
 * @param list
 * @param Gender
 * @return 
 */
    @Override
    public List<SongCollection> FilterGenre(SongCollection[] list, String Gender) {
        List<SongCollection> SongC = new ArrayList();
        
        for(int i = 0; i<list.length;i++){
            if(list[i].genre.equalsIgnoreCase(Gender)){
                SongC.add(list[i]);
            }
        }
        return SongC;
    }
    
/**
 * Implementacion del metodo FiltrarAño en el cual le ponemos los parametros Lista y Fecha
 * llamamos Album como vector luego se crea un for el cual me va recorrer el vector Album
 * una vez termine de recorrerlo va hacer una comparacion de lista en la posicion i con el parametro
 * Fecha una vez la comparacion sea verdadera mostrara mostrara todos los albunes del año comparado 
 * @param list
 * @param Date
 * @return 
 */
    @Override
    public List<SongCollection> FilterYear(SongCollection[] list, int Date) {
        List<SongCollection> SongC = new ArrayList();
        
        for(int i = 0; i < list.length; i++){
        
            if (list[i].date == Date) {
                SongC.add(list[i]);
            }
        }
        
        return SongC; 
    }
    
    /**
    * Metodo creado con el fin de ordenar la lista principal de músicas por año
    * y duración aca aplicamos el metodo burbuja para comparar las fechas
    * por posicion y posteriormente ir ordenando de menor a mayor
    */
    @Override
    public void FilterYearDuration(ArrayList<SongCollection> SongF) {
        for (int i = 0; i<SongF.size();i++){
            SongCollection aux;
            for(int j =i+1;j<SongF.size();j++){
                if(SongF.get(i).date > SongF.get(j).date){
                aux=SongF.get(j);
                SongF.set(j,SongF.get(i));
                SongF.set(i,aux);
                }
            }
        }
    }
}
