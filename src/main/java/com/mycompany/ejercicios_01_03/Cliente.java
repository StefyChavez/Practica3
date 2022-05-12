/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Cliente {
    
    
    String nombre;
    String apellido;
    int cedula;
    String direccion;
    
    public String obtenerCedula()
    {
        var retorno="TBD";
        
        if(this.cedula==10){
            retorno=" Cedula Correcto";
        }else{
            if(this.cedula>10 || this.cedula<9){
                retorno=" Cedula Incorrecta";
            }
        }
        
        return retorno;
    }
    
}
