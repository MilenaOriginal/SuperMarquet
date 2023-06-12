package supermercado;

public class ProductoPN extends Producto{
    
    public ProductoPN(String nombre, int precio, boolean precioCuid){
        super(nombre,precio,precioCuid);
    }
    public double aplicarDescuento(){
        double precioD=precio-precio/10;
        return precioD;
    }
    public boolean tipo(){
        boolean tipo=true;
        return tipo;
    }
    
}
