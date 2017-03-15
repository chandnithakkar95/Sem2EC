package lab01;
import java.util.Scanner;
import java.io.PrintStream;

public class StringSorterBubble {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		PrintStream output = System.out;
		System.out.println("enter the how many string you want to enter");
		int noOfStrings=input.nextInt();
		String[] arr=new String[noOfStrings];
		
		input.nextLine();
		for(int i=0;i<noOfStrings;i++){
			arr[i]=input.nextLine();	
		}

		for(int i =0 ; i < noOfStrings;i++){
			for(int j = i+1;j<noOfStrings;j++){
				if(arr[i].compareToIgnoreCase(arr[j])>0){
					String temp = arr[i];
	                arr[i]=arr[j];   
	                arr[j]=temp; 
				}
			}
		}
		System.out.println("Resulting Array Of Strings : ");
		for(int i=0;i<noOfStrings;i++){
			output.println(arr[i]+" ");
		}
		input.close();
	}
}