/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios_01_03;
/**
 *
 * @author admin
 */
public class Ejercicios_01_03 {

   public static void main(String[] args) {
        
        
        System.out.println("Primera Clase Actor/Pelicula/Personaje");
        var datosActor=new Actor();
        datosActor.nombre="Lily";
        datosActor.apellido="Collins";
        var datosPelicula=new Pelicula();
        datosPelicula.idioma="Espejito Espejito";
        var datosPersonaje=new Personaje();
        datosPersonaje.rol="Estelar";
        datosPersonaje.nombre=" Blanca Nieves "; 
        var rolPersonaje = false;
        rolPersonaje=datosPersonaje.verRol();
        if(rolPersonaje== true){
        System.out.println( datosActor.nombre + " " + datosActor.apellido );
        System.out.println("Participo con el personaje de: "+ datosPersonaje.nombre);
        System.out.println("En la pelicula: "+ datosPelicula.idioma);
        System.out.println("Como el actor: " + datosPersonaje.rol);
        }else{
              System.out.println( " Antagonista ");
        }
        System.out.println(datosPelicula.obtIdioma());
        System.out.println(datosActor.verCalificacion(25));
        
        System.out.println("**************************************************");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Segunda Clase Producto/Factura/Cliente");
        var datosProducto = new Producto();
        datosProducto.codigo=003;
        datosProducto.color="Negro";
        datosProducto.precio = 50;
        datosProducto.marca="4";
        
        var datosCliente = new Cliente();
        datosCliente.nombre="Maribel";
        datosCliente.apellido="Santacruz";
        datosCliente.cedula=10;
        datosCliente.direccion="Cuenca";
        
        var datosFactura = new Factura();
        datosFactura.fecha=12/03/2022;
        datosFactura.ruc=01054;
        datosFactura.nombreProducto="Z";
        
        System.out.println("Nombre del Cliente: "+datosCliente.nombre + " "+datosCliente.apellido);
        System.out.println("Numero: "+ datosCliente.obtenerCedula());
        System.out.println("Direccion: "+datosCliente.direccion);
        System.out.println("    ");
        System.out.println("El codigo del producto es: "+datosProducto.codigo);
        System.out.println("El color es: "+datosProducto.color);
        System.out.println("La marca es: "+datosProducto.verMarca());
        System.out.println("El precio es: "+datosProducto.precio);
        System.out.println("    ");
        System.out.println("El Ruc de la factura es: "+datosFactura.ruc);
        System.out.println("La fecha es: "+datosFactura.fecha);
        System.out.println("El Producto es: "+datosFactura.verNombreProducto());
    }     
}
