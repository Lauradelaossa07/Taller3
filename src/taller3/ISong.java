/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan Emilio Brito Avilez
 */
public interface ISong {
    
    /**
     * Creamos el metodo Arreglo FiltrarGenero en el cual ponemos como parametros
     * Genero y el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @param Gender
     * @return 
     */
    public List<SongCollection> FilterGenre(SongCollection[] list, String Gender);
    
    /**
     * Creamos el metodo Arreglo FiltrarAño en el cual ponemos como parametros
     * Fecha y y el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @param Date
     * @return 
     */
    
    public List<SongCollection> FilterYear(SongCollection[] list,int Date);
    
    /**
     * Creamos el metodo Arreglo FiltrarAñoDuracion en el cual ponemos como parametros
     * el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @return 
     */
    
     public void FilterYearDuration(ArrayList<SongCollection> SongF);
}
