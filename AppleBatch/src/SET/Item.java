package SET;

public class Item {
   int id,price,quantity;
   String name;
public Item(int id, int price, int quantity, String name) {
	
	this.id = id;
	this.price = price;
	this.quantity = quantity;
	this.name = name;
}

    public int hashCode() {
    	return id;
    }
    
    
    
    public boolean equals(Item o) {
    	Item i=(Item)o;
    		if(this.id==i.id) {	
    		return true;
    		}
    		else {
    			return false;
    		}
    }
    public String toString() {
    	return "Item [id=" + id + ", price=" + price + ", quantity=" + quantity + ", name=" + name + "]";
    }
    
}
