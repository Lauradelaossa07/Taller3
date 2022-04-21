/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 * Clase abstracta contiene los atributos principales a heredar a su clase hija
 * y los metodos get y set de cada atributo, ademas los metodos abstractos
 * @author Jonathan Emilio Brito Avilez
 * @author Laura
 */
public abstract class Song {
     public String title;
    public int identifier;
    public int date;
    public float duration;
    public String genre;
    public String detail;

    /**
     * Constructor de la clase abstracta
     * @param title
     * @param identifier
     * @param date
     * @param duration
     * @param genre
     * @param detail 
     */
    public Song(String title, int identifier, int date, float duration, String genre, String detail) {
        this.title = title;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    /**
    * Metodo creado con el fin de mostrar la informacion de las muscias
    * de manera mas clara
    * @return informacion estructurada de cada canción
    */
    
    public String toString() {
        return "Music{" + "Title=" + title + ", Date=" + date + ", Duration=" + 
                duration + ", Gender=" + genre + ", Description" + detail + "}";
    }  
}
