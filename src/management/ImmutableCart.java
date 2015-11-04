package management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableCart {
	private final List items;  
	private int b=0;
    public ImmutableCart(List items) {  
        this.items = Collections.unmodifiableList(new ArrayList(items));  
    }  
  
    public List getItems() {  
        return items;  
    }  
  
    public static void main(String[] args) {  
        List list = new ArrayList();  
        list.add("element1");  
        ImmutableCart cart = new ImmutableCart(list);  
        //cart.getItems().add("element2"); 
        cart.b=9;
        System.out.println(cart.b);
        Tfinal t=new Tfinal();
        System.out.println(t.a);
        //t.a=8;
   }  
}
class Tfinal{
	 final int a=3;

	public int getA() {
		return a;
	}
	
}
