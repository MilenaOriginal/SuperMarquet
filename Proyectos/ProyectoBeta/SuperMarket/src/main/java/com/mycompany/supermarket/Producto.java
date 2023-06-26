/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermarket;

/**
 *
 * @author CS-05
 */
public class Producto {
    private String nombre;
    protected int precio;
    private boolean precioCuid;

    public Producto(String nombre, int precio, boolean precioCuid) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuid = precioCuid;
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("nombre del producto: "+nombre );
        System.out.println("precio del producto: "+nombre );
        if(precioCuid){
            System.out.println("el producto es parte del programa Precios Cuidados ");
        }
        else{
            System.out.println("el producto no es parte del programa Precios Cuidados");
        }
    
    }
     public boolean tipo(){
        boolean tipo=false;
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

     
}