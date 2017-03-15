package lab05;


public class PollDB {
	private String[] candidates;
	private int numberOfCandidate;
	private int[] votes;
	private String pass="Chandu@1009";
	public PollDB(String[] candNames) {
		// TODO Auto-generated constructor stub
		setNumberOfCandidate(candNames.length);
		setCandidates(candNames);
		votes=new int[numberOfCandidate];
	}
	public String getPassword() {
		return pass;
	}
	public int getNumberOfCandidates() {
		// TODO Auto-generated method stub
		return numberOfCandidate;
	}
	public void setNumberOfCandidate(int numberOfCandidate) {
		this.numberOfCandidate = numberOfCandidate;
	}
	public void voteTo(int x) {
				votes[x-1]++;
	}

	public String getCandidateName(int i) {
		// TODO Auto-generated method stub
		return candidates[i-1];
		
	}

	public int  votesCount(int i) {
		// TODO Auto-generated method stub
		return votes[i-1];
	}

	public String getWinner() {
		// TODO Auto-generated method stub
		int max=votes[0];
		int maxIndex=0;;
		for(int i=0;i<getNumberOfCandidates();i++){
			if(votes[i]>max){
				max=votes[i];
				maxIndex=i;
			}
		}
		return getCandidateName(maxIndex+1);
		
	}

	public String[] getCandidates() {
		return candidates;
	}

	public void setCandidates(String[] candidates) {
		this.candidates = candidates;
	}

}
