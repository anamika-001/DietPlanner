package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.ItemDetails;

public class ItemOperation {
	static List<ItemDetails> veg=new ArrayList<ItemDetails>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public void addVegItems(ItemDetails items) {
		if(veg.add(items)) {
			System.out.println("Item Added ");
		}
	}
	
	public void add() throws IOException {
		System.out.println("Enter below details :");
		System.out.print("Id :");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Item :");
		String item = br.readLine();
		System.out.print("Calories :");
		String calories = br.readLine();
		ItemDetails items =new ItemDetails(id,item,calories);
		items.setId(id);
		items.setItem(item);
		items.setCalories(calories);
		addVegItems(items);
		veg = Operations.addv(items);
		
		Excel excel =new Excel();
		excel.writefromExcel(items);
	
	}
     public void display() {
		System.out.println("Id\tItem\tCalories");
		for(ItemDetails v : veg) {
			
			System.out.print(v.getId());
			System.out.print("\t"+v.getItem());
			System.out.println("\t"+v.getCalories());
		}
	}
     

		
     public void removeitems(ItemDetails v) {
 		if(veg.remove(v)) {
 			System.out.println("Item deleted successfully");
 		}
 	}
     public void remove() throws IOException{
    	 System.out.println("lets delete some items...");
    	 System.out.println("Enter details of items you want to delete");
    	 System.out.print("enter Id :");
    	 int id = Integer.parseInt(br.readLine());
 		System.out.print("enter Item :");
		String item = br.readLine();
 		System.out.print("enter Calories :");
    	 String calories=br.readLine();
   	 ItemDetails v =new ItemDetails(id,item,calories);
  	     v.getId();
    	 v.getItem();
    	 v.getCalories();
   	  
    		 if(v.getId()==id && v.getItem().equals(item) && v.getCalories().equals(calories)) {
    			 System.out.println(v.getItem()+" deleted");
    			 
    			 removeitems(v);
    		 }
    	 }
    	 
     }

	
	

	

