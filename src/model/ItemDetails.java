package model;

public class ItemDetails {
	public int id;
	public String item;
	public String calories;
	public ItemDetails(int id, String item, String calories) {
		
		this.id = id;
		this.item = item;
		this.calories = calories;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
}
