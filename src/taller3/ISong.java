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
    public List<SongCollection> FilterGenre(SongCollection[] list, String Gender);
    
    public List<SongCollection> FilterYear(SongCollection[] list,int Date);
    
     public void FilterYearDuration(ArrayList<SongCollection> SongF);
}
