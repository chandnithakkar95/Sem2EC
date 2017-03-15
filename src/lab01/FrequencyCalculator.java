package lab01;

import java.io.PrintStream;
import java.util.Random;

public class FrequencyCalculator {
	public static void main(String[] args) {
		PrintStream sysout=System.out;
		Random rn = new Random();

		int answer[] =new int [10];
		int cnt[][]=new int[10][2];
		for(int i=0;i<10;i++){
			answer[i]=rn.nextInt(10) + 1;
			cnt[i][0]=i+1;
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(answer[j]==cnt[i][0]){
					cnt[i][1]++;
				}
			}
		}
		sysout.println("Numbers :");
		for(int i=0;i<10;i++){

			sysout.print(answer[i]+" ");


		}
sysout.println();
		for(int i=0;i<10;i++){

			sysout.println(cnt[i][0]+" "+ cnt[i][1]);


		}

	}
}