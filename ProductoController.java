import java.util.ArrayList; 


public class ProductoController {
    
private ArrayList<producto> productos; 

public ProductoController(){

    productos = new ArrayList<>();  

}

public void AgregarProducto(producto p){
    
  productos.add(p);

}

public void listarProductos(){

    for(producto p : productos){

        System.out.println ("-------------------------------------------------");
        System.out.println("ID: " + p.getID());
        System.out.println("Nombre" + p.getName());
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Stock: " + p.getStock());
        System.out.println("-------------------------------------------------");
    }
}


public producto BuscarProductoPorID(int id){

for(producto p : productos){
if (p.getID() == id) {
    return p; 
}
    
}



return null; 

} 

    }






