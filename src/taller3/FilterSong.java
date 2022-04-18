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
