/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Personaje {
    
    String nombre;
    String rol;
    int codigo;
    int edad;
    
    public boolean verRol(){
        var retorno=false;
        if(this.rol=="Estelar"){
            retorno=true;
        }
        return retorno;   
    }
}
    
