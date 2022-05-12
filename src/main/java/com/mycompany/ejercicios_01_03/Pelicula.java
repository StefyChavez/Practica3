/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Pelicula {
    
    String genero;
    String titulo;
    String idioma;
    int costo;
    
    public String obtIdioma(){
        var retorno="";
            if(this.idioma==" Ingles "){
               retorno= " Mirror Mirror ";
            }else{
            if(this.idioma==" Espanol "){
                retorno= " Blanca Nieves ";
            }          
         } 
       
        return retorno; 
    }
    
}
