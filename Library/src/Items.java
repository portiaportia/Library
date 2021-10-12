import java.util.ArrayList;

public class Items {
	private static Items items;
	private ArrayList<Item> itemList;
	
	private Items() {
		itemList = Database.getItems();
	}
	
	public static Items getInstance() {
		if(items == null) {
			items = new Items();
		}
		
		return items;
	}

	public boolean addItem(String itemName, String itemDescription){
		return true;
	}

	public boolean haveItem(String itemName) {
		return true;
	}
	
	public Item getItem(String itemName) {
		return null;
	}
}
