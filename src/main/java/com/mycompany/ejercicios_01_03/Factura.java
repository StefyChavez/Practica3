/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_01_03;

/**
 *
 * @author admin
 */
public class Factura {
    
    int ruc;
    String nombreProducto;
    int fecha;
    
    public String verNombreProducto(){
        var retorno="TBD";
        var prenda=this.nombreProducto.charAt(0);
        switch(prenda)
        {
            case 'C':
                retorno="Camisa";
                break;
            case 'P':
                retorno="Pantalon";
                break;
            case 'Z':
                retorno="Zapatos";
                break;
            case 'K':
                retorno="Chompa";
                break;
  
            default:
                retorno="Prenda no Disponible";
        }
        return retorno;
    }  
}
