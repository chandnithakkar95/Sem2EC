package lab04;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory{ 
	LinkedList<InventoryItem> inventoryItem;
	public Inventory(){ 
		inventoryItem=new LinkedList<InventoryItem>();

	}  
	public void addNewInventoryItem(InventoryItem new_item){ 

		inventoryItem.add(new_item);
	}  
	public void addStock(int item_code, int qty) throws ItemNotFound {
		//adds specified qty of specified item to the inventory
		for (InventoryItem inventoryItem2 : inventoryItem) {
			if(inventoryItem2.getCode()==item_code)
				inventoryItem2.addStock(qty);

			else{
				throw new ItemNotFound("Sorry No item Available");
			}
		}		//you may have locate the specified item in the collection before increasing its stock
	}  
	public void withdrawStock(int item_code, int qty)throws ItemNotFound, InSufficientStock { 
		InventoryItem tmp= search(item_code);
		tmp.withdrawStock(qty);
	}  

	public InventoryItem[] itemsUnderStock() 
	{
		ArrayList<InventoryItem> itm=new ArrayList<InventoryItem>();
		for (InventoryItem inventoryItem2 : inventoryItem) {
			if(inventoryItem2.isUnderStock())
				itm.add(inventoryItem2);
		}
		InventoryItem[] temp = new InventoryItem[0];
		temp = itm.toArray(temp);
		return temp;
	}
	 private InventoryItem search(int item_code)throws ItemNotFound { 
		//returns item object with given item code, if found
		for (InventoryItem inventoryItem2 : inventoryItem) {
			if(inventoryItem2.getCode()==item_code)
					return inventoryItem2;
		}
				throw new ItemNotFound("Sorry not Found");
	} 
	public double totalInventoryCost() 
	{ 
		double cost=0.0;
		for (InventoryItem inventoryItem2 : inventoryItem) {
			cost+=inventoryItem2.getCost();
		}
		return cost;
	}  

} 