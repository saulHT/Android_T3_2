package com.example.practica_t3.entidades;

public class Anime {
    private String url;
    private String nombre;
    private String describe;


 public Anime(String url,String nombre,String describe){
     this.url=url;
     this.nombre=nombre;
     this.describe=describe;
 }

    public String getNombre() {
        return nombre;
    }

    public String getDescribe() {
        return describe;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
