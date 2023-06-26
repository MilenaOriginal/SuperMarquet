package supermercado;

import java.util.ArrayList;

public class Super {
    private ArrayList<Venta> ventas=new ArrayList();
    private int cantPrimeraNecesidad;
    private int cantCuidados;

    public Super() {
      
    }
    
    public void agregarVenta(Venta v){
        ventas.add(v);
    }
    
    public int calcCuid(){
        int cantCuid=0;
        for(Venta v:this.ventas){
            cantCuid+=v.calcularCantCuid();
        }
        this.cantCuidados=cantCuid;
        return cantCuid;
    }   
    public  int calcPN(){
        int cantPN=0;
        for(Venta v:ventas){
            cantPN+=v.calcularPN();
        }
        this.cantPrimeraNecesidad=cantPN;
        return cantPN;
    }
    
    public void mostrarDatos(){
        for(Venta d:ventas){
            d.mostrarProductos();
        }
        System.out.println("la cantidad de productos de primera necesidad es: "+this.cantPrimeraNecesidad+"\n"+"y su cantidad de productos con precio cuidado es de: "+this.cantCuidados+"\n"+"estos datos son de el dia: ");
        
    }
    
    public double calcularTotal(){
        double total=0.0;
        for(Venta v:ventas){
            total+=v.calcularPrecioT();
        }
        return total;
    }
    
    public double totalDesc(String fecha){
        double cantDesc=0;
        for(Venta v:ventas){
            if(v.getFecha().equalsIgnoreCase(fecha)){
                cantDesc=cantDesc+v.cantDescontadaPN();
                }
            }
            return cantDesc;
        }
    
    public int calcCuidFecha(String fecha){
        int cantCuid=0;
        for(Venta v:ventas){
            if(v.getFecha().equalsIgnoreCase(fecha)){
            cantCuid+=v.calcularCantCuid();
            }
        }
        return cantCuid;
    }
    
    
    
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getCantPrimeraNecesidad() {
        return cantPrimeraNecesidad;
    }

    public void setCantPrimeraNecesidad(int cantPrimeraNecesidad) {
        this.cantPrimeraNecesidad = cantPrimeraNecesidad;
    }

    public int getCantCuidados() {
        return cantCuidados;
    }

    public void setCantCuidados(int cantCuidados) {
        this.cantCuidados = cantCuidados;
    }
    
}
