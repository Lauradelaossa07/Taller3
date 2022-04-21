/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 * Esta clase hereda de la clase abstracta sus atributos y metodos
 * nos permite poder instanciar desde nuestra clase main un nuevo objeto
 * @author Jonathan Emilio Brito Avilez
 * @author Laura
 */
public class SongCollection extends Song{
    
   /**
   * contador creado para generar un Id por cada objeto que se cree de la clase
   */
    
    static int musicCounter =0;
    private int idMusic;

    public SongCollection(String title, int identifier, int date, float duration, String genre, String detail) {
        super(title, identifier, date, duration, genre, detail);
        this.idMusic=++ SongCollection.musicCounter;
    }
    
    /**
    * metodo usado para obtener el id que se generara por objeto
    * @return id
    */
    
    public String getTitle(){
        return this.title;
    }
    
    public int getidMusic(){
        return idMusic;
    }
}
