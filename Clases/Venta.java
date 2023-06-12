package supermercado;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double precioT;
    private Hora hora;
    
    public Venta(ArrayList<Producto> p, Hora hora){
        this.productos = p;
        this.hora = hora;
        double pt=0;
        for ( Producto pr: p ){
            pt = pt + pr.getPrecio();
        }
        this.precioT = pt;
    }
    
    public double calcularPrecioT(){
        double pt=0;
        for ( Producto pr: this.productos ){
            pt = pt + pr.getPrecio();
        }
        return(pt);
    }
    
    public int calcularPN(){
        int pn = 0;
        for ( Producto pr: this.productos ){
            if (pr.tipo == 1){
                pn = pn + 1;
            }
        }
        return pn;
    }
    public int calcularCantCuid(){
        int pn = 0;
        for ( Producto pr: this.productos ){
            if (pr.precioCuid == 1){
                pn = pn + 1;
            }
        }
        return pn;
    }
    
    public void mostrarProductos(){
        System.out.println("Los productos de esta venta son: ");
        int x = 0;
        for ( Producto pr: this.productos ){
            x++;
            System.out.print(x + ". ");
            pr.mostrarDatos();
            System.out.println("");
        }
    }
    
}
