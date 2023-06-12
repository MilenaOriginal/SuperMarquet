package supermercado;

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
    
}



