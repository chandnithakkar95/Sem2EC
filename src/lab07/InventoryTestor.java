package lab07;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import lab04.InSufficientStock;
import lab04.InventoryItem;
import lab04.ItemExists;
import lab04.ItemNotFound;

public class InventoryTestor {

	public static void main(String[] args) {

		while(true){

			System.out.println("1: Insert Item");
			System.out.println("2: Insert Item Array");
			System.out.println("3: Update Item");
			System.out.println("4: Update Item Array");
			System.out.println("5: Get Item");
			System.out.println("6: Get Item Array");
			System.out.println("7: Add item Stock");
			System.out.println("8: Delete item Stock");
			System.out.println("9: Delete Item");
			System.out.println("10: Delete Item Array");
			System.out.println("11: Exit");

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			InventoryDAO itemdao;
			try {
				itemdao = new InventoryDAO();
				InventoryItem item;
				int a;
				int b;
				int c;
				String itm_description;
				double cost;
				switch(n){

				case 1:

					System.out.println("Enter item code");
					a = sc.nextInt();

					System.out.println("Enter Quantity");
					b = sc.nextInt();

					System.out.println("Enter min qty");
					c = sc.nextInt();

					System.out.println("Enter description");
					itm_description=sc.next();

					System.out.println("Enter cost");
					cost=sc.nextDouble();
					item=new InventoryItem(a, itm_description, b, c, cost);
					itemdao.InsertItem(item);
					break;
				case 2:

					System.out.println("Enter array size");
					int d = sc.nextInt();

					InventoryItem[] items = new InventoryItem[0] ;
//					for(int i = 0; i<d;i++){
//						System.out.println("Enter item code");
//						a = sc.nextInt();
//
//						System.out.println("Enter Quantity");
//						b = sc.nextInt();
//
//						System.out.println("Enter min qty");
//						c = sc.nextInt();
//
//						System.out.println("Enter description");
//						itm_description=sc.next();
//
//						System.out.println("Enter cost");
//						cost=sc.nextDouble();
//						items[i] = new InventoryItem(a, itm_description, b, c, cost);
//
//					}
					items=itemdao.getItems();
					for(int i=0;i<items.length;i++) {
						System.out.println(items[i].toString());
					}
					//itemdao.InsertItems(items);
					break;

				case 3:

					System.out.println("Enter item code");
					a = sc.nextInt();

					System.out.println("Enter Quantity");
					b = sc.nextInt();

					System.out.println("Enter min qty");
					c = sc.nextInt();

					System.out.println("Enter description");
					itm_description=sc.next();

					System.out.println("Enter cost");
					cost=sc.nextDouble();

					itemdao.updateItem(new InventoryItem(4, itm_description, b, c, cost));
					break;

				case 5:

					System.out.println("Enter item code");

					a = sc.nextInt();

					item= itemdao.getItem(a);
					System.out.println(item.toString());
					break;
				case 7:

					System.out.println("Enter item code");
					b =sc.nextInt();
					System.out.println("Enter qty");
					c = sc.nextInt();
					itemdao.addStock(b, c);
					break;

				case 8:
					System.out.println("Enter item code");
					b= sc.nextInt();
					System.out.println("Enter qty");
					c= sc.nextInt();
					itemdao.withdrawStock(b, c);
					break;

				case 9:
					System.out.println("Enter item code");
					b= sc.nextInt();
					itemdao.deleteItem(b);
					break;

				case 11:
					System.exit(1);
					break;
				}
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ItemExists e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ItemNotFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InSufficientStock e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}