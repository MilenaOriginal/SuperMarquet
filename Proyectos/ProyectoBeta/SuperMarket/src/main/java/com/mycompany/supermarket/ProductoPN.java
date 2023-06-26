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
public class ProductoPN extends Producto{
    private double cantDescontada;
        
    public ProductoPN(double cantDescontada, String nombre, int precio, boolean precioCuid){
        super(nombre,precio,precioCuid);
        this.cantDescontada=precio/10;
    }
    public double aplicarDescuento(){
        double precioD=precio-cantDescontada;
        return precioD;
    }
    public boolean tipo(){
        boolean tipo=true;
        return tipo;
    }
    
}
