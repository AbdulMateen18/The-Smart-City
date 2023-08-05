

public class Items {
private double itemId;
private String itemName;
public Items(double itemId, String itemName) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
}
@Override
public String toString() {
	return "ID of Item: "+ itemId+
			"\tItemName: "+ itemName
			;
}


}