
public class Library {
	private Items items;
	private Users users;
	
	public Library() {
		items = Items.getInstance();
		users = Users.getInstance();
	}

	public User login(String userName, String password){
		return null;
	}

	public boolean createAccount(String userName, String password) {
		return true;
	}

	public boolean createItem(String title, String description){
		return true;
	}
	
	//Returns true if item is found, and false otherwise
	public boolean findItem(String itemName) {
		return items.haveItem(itemName);
	}
	
	public boolean checkout(String itemName) {
		if(!findItem(itemName))return false;
		
		//checkout the item
		//need a user then have them checkout an item
		return true;
	}
	
	public boolean rateItem(String itemName, int rating) {
		if(!findItem(itemName))return false;
		
		if(rating < 0 || rating > 5) return false;
		
		return true;
	}
	
	public boolean payFine(int amount) {
		if(amount < 0) return false;
		
		return true; 	//successfully paid fine
	}
}
