/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Actor {
    
    String nombre;
    String apellido;
    int cedula;
    int calificacion;
    public  String verCalificacion(int puntajeActor){
        var retorno = "--- ";
            if(puntajeActor>=0 && puntajeActor<=5){
               retorno= " Mala Actor ";
            }else{
            if(puntajeActor>=6 && puntajeActor<=15){
                retorno= " Intermedio ";
            }else{
             if(puntajeActor>=16 && puntajeActor<=30){
                retorno= " Actor Estrella ";
             } 
            }          
         }    
        return retorno;
        
    }  
}
