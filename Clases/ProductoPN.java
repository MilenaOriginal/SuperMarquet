package supermercado;

public class ProductoPN extends Producto{
// este atributo debería ser el porcentaje que el dueño quiere descontar (que en algún momento podría cambiar)
    // ademas es un porcetnaje sobre el precio, por lo que hay que calcularlo NO recibirlo
    private double cantDescontada;
        
    public ProductoPN(String nombre, int precio, boolean precioCuid){
        super(nombre,precio,precioCuid);
        // NO debería recibir cantDescontada sino "porc" de tipo int
        // this.precio=precio - ((precio * porc)/100)
        this.cantDescontada=precio/10;
    }
    // si lo resuleven con un calculo en el constructor este método no tiene sentido
    public double aplicarDescuento(){
        double precioD=precio-cantDescontada;
        return precioD;
    }
    public boolean tipo(){
        boolean tipo=true;
        return tipo;
    }
    
}
