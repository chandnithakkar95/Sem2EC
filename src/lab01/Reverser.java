package lab01;

import java.util.Random;

public class Reverser {
	public static int[] reverse(int[] input){ 
		if(input == null || input.length <= 1){
			return null; 
		}
		for (int i = 0; i < input.length / 2; i++) {
			int temp = input[i]; // swap numbers 
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp; 
		}
		return input;
	}
	public static void main(String[] args) {

		int answer[] =new int[10];
		
		for(int i=0;i<10;i++){
			answer[i]=i+1;
		}
		System.out.println("Before Reverse");
		for(int i=0;i<10;i++){
			System.out.print(answer[i]+" ");
		}
		answer=reverse(answer);
		System.out.println("After Reverse:");
		for(int i=0;i<10;i++){
			System.out.print(answer[i]+" ");
		}
		
	}
	
}

