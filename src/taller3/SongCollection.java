/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class SongCollection {
    private ArrayList<Song> song;
    
    public SongCollection(){
        song = new ArrayList<>();
    }
    
    public void AddSong(String title, int identifier, int date, float duration, String genre, String detail){
        Song current = new Song(title,identifier,date,duration,genre,detail); 
        song.add(current);
    }
   
    public void ViewSong(){
        for(int i =0; i<song.size();i++){
            System.out.println(song.get(i).getTitle());
        }
    }
    
    public void ViewGenre(){
        for(int i =0; i<song.size();i++){
            System.out.println(song.get(i).getGenre());
        }
    }
    
    public void SearchGenre(String genre){
        for(int i =0; i<song.size();i++){
            if (genre== song.get(i).getGenre()){
                System.out.println(song.get(i).getTitle());
                
            }
        }
    }
}
