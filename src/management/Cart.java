package management;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    	private final List items;  
    	  
        public Cart(List items) {  
            this.items = items;  
        }  
      
        public List getItems() {  
            return items;  
        }  
      
        public static void main(String[] args) {  
            List list = new ArrayList();  
            list.add("element1");  
            Cart cart = new Cart(list);  
            cart.getItems().add("element2");  
      
            // 下面的代码能运行吗？为什么  
             list=new LinkedList();  
            // cart.items=list;  
        } 
        
        public void testFinal(){
        	List list = new ArrayList();  
        	final Cart cart=new Cart(list);
        	//cart=new Cart(list);
        }
}
