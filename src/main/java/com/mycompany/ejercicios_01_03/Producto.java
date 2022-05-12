/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Producto {
    
    String marca;
    String color;
    int codigo;
    int precio;
    
    public String verMarca(){
        var retorno="TBD";
        var marcaDisponible=this.marca.charAt(0);
        switch(marcaDisponible)
        {
            case '1':
                retorno="GUCCI";
                break;
            case '2':
                retorno="NIKE";
                break;
            case '3':
                retorno="DIOR";
                break;
            case '4':
                retorno="PRADA";
                break;
            case '5':
                retorno="LOUIS VUITTON";
                break;
  
            default:
                retorno="Marca no Disponible";
        }
        return retorno;
    }  
}
