package Service;

	

	import java.util.ArrayList;
	import java.util.List;

	import model.ItemDetails;
	public class Operations {


	
		static int value= 0;
		
		
	static List<ItemDetails> lists = new ArrayList<ItemDetails>();

	public static List<ItemDetails> addv(ItemDetails items) {
		lists.add(items);
			return lists;	
			}

	public List<ItemDetails> getAllMachines(ItemDetails items){
		return lists;
		}

	}





