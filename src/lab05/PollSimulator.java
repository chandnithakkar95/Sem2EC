package lab05;

import java.util.Random;
public class PollSimulator {
	public static void main(String[] args) {

		String[] candNames = new String[5];
		candNames[0] = "Deep Goyal";
		candNames[1] = "Sneha Mohan";
		candNames[2] = "Praveen Shah";
		candNames[3] = "Akshay Singh";
		candNames[4] = "Somin Majumdar";
		PollDB poll_db = new PollDB( candNames );
		
		int nc = poll_db.getNumberOfCandidates();
		//System.out.println(nc);
		Random rand = new Random();
		for( int i = 1; i <=50; i++ ) {
			int x = 1 + rand.nextInt(nc);
			poll_db.voteTo( x );
		} //Assume that candidates are identified as 1 through 5
		//Report the election result
		for(int i = 1;i <= poll_db.getNumberOfCandidates(); i++ ) {
			System.out.println(poll_db.getCandidateName(i)+ ": " + poll_db.votesCount(i));
		}
		System.out.println("Winner: " + poll_db.getWinner());
	}
}