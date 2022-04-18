/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 * @author Jonathan Emilio Brito Avilez
 * @author Laura
 */
public class SongCollection extends Song{
    static int musicCounter =0;
    private int idMusic;

    public SongCollection(String title, int identifier, int date, float duration, String genre, String detail) {
        super(title, identifier, date, duration, genre, detail);
        this.idMusic=++ SongCollection.musicCounter;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getidMusic(){
        return idMusic;
    }
}
