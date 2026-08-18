
public class producto {

private int id; 
private String name;
private double precio; 
private int stock; 

public int getID(){ 
return this.id; 

}

public void setID (int id){

    this.id = id; 
}

public String getName(){
    return this.name; 
}

public void setName(String name){

    this.name = name; 
} 

public double getPrecio(){
    return this.precio; 

}
public void setPrecio(double precio){

    this.precio = precio; 

} 

public int getStock(){
    return this.stock; 

}

public void setStock(int stock){

    this.stock = stock; 

}

public producto(int id, String name, double precio, int stock){
    this.id = id; 
    this.name = name; 
    this.precio = precio; 
    this.stock = stock; 

}

} 
