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
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    
    public void mostrarDatos(){
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
}