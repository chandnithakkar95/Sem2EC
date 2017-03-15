package lab04;

import java.io.PrintStream;
import java.util.Scanner;


public class InventoryTester {
	static	Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		PrintStream out=System.out;
		Inventory it=new Inventory();
		while(true){
			out.println("1 add Item");
			out.println("2 add Stock");
			out.println("3 withdraw Stock");
			out.println("4 Display uder stock items");
			out.println("5 Display all items");
			
			out.println("5 exit");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				out.println("Enter Code");
				int code=sc.nextInt();
				out.println("Enter description about item");
				String description=sc.next();
				out.println("Enter Cost");
				double cost=sc.nextDouble();
				out.println("Enter min qty");
				int minqty1=sc.nextInt();
				out.println("Enter qty");
				int qty=sc.nextInt();
				it.addNewInventoryItem(new InventoryItem(code, description,qty,minqty1, cost));
				break;
			case 2:
				out.println("Enter Code");
				int code2=sc.nextInt();
				out.println("Enter quantity");
				int qty1=sc.nextInt();
				try {
					it.addStock(code2, qty1);
				} catch (ItemNotFound e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;
			case 3:
				out.println("Enter Code");
				int code3=sc.nextInt();
				out.println("Enter quantity");
				int qty4=sc.nextInt();
				try {
					it.withdrawStock(code3, qty4);
				} catch (ItemNotFound | InSufficientStock e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;
			case 4:
				InventoryItem[] inventoryItems =it.itemsUnderStock();
				for(int i=0;i<inventoryItems.length;i++){
					System.out.println("item "+i +": " + inventoryItems[i].getDescription());
				}
			case 5:
				System.exit(1);
			}
		}
	}
}
