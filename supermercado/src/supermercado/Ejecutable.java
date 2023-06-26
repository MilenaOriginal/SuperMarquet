package supermercado;
import java.util.*;
public class Ejecutable {

    public static void main(String[] args) {
        String choice="si";
        Scanner key=new Scanner(System.in);
        Super supers=new Super();
        while(choice.equalsIgnoreCase("si")){
            Venta v=crearVenta();
            supers.agregarVenta(v);
            System.out.println("desea agregar otra venta? si/no");
            choice=key.next();
        }
        
        System.out.println("la cantidad total vendida es: ");
        System.out.println("total: "+supers.calcularTotal());
        System.out.println("la cantidad total de productos de primera necesidad es: ");
        System.out.println(supers.calcPN());
        System.out.println("de que fecha desea ver la cantidad de productos con precios cuidados vendidos ");
        String fecha=key.next();
        System.out.println(supers.calcCuidFecha(fecha));
        System.out.println("de que fecha desea ver la cantidad descontada en productos de primera necesidad ");
        String fech=key.next();
        System.out.println(supers.totalDesc(fech));
    }
    public static Venta crearVenta(){
        Scanner t = new Scanner(System.in);
        System.out.println("cual es la fecha de la venta? ");
        String fecha=t.next();
        //t.close();
        Venta venta=new Venta(fecha);
        String choice="si";
       // Scanner d = new Scanner(System.in);
        while(choice.equalsIgnoreCase("si")){
            Producto p=crearProducto();
            venta.agregarProducto(p);
            System.out.println("desea agregar otro producto? si/no");
            choice=t.next();
        }
        return venta;
    }
    public static Producto crearProducto(){
        Scanner key=new Scanner(System.in);
        Producto p=null;
        System.out.println("nombre del producto? ");
        String nombre=key.next();
        System.out.println("precio del producto? ");
        double precio=key.nextDouble();
        System.out.println("el producto es parte del programa Precios Cuidados? si/no");
        String cuid=key.next();
        boolean precioCuid=false;
        if(cuid.equalsIgnoreCase("si")){
            precioCuid=true;
        }
         else if (cuid.equalsIgnoreCase("no")){
            precioCuid=false;
        }
        System.out.println("es un producto de primera necesidad? si/no");
        String PN=key.next();
        if(PN.equalsIgnoreCase("no")){
            p=new Producto(nombre,precio,precioCuid);
        }
        else if (PN.equalsIgnoreCase("si")){
            p=new ProductoPN(nombre,precio,precioCuid);
        }
        return p;
    }
            
        
   
       
}
