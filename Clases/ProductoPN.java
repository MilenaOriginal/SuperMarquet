package supermercado;

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
