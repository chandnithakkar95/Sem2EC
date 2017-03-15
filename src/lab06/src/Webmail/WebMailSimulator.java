package lab06.src.Webmail;

public class WebMailSimulator {
	
	public static void main(String[] str) {

		WebMail webm = new WebMail();
		User temp = new User("abc", "xyz");
		webm.addUser(temp);
		User user = webm.login("abc", "xyz");
		//login operation throws an exception if login is not successful
		MailBox mbox = user.getMbox();

		Message m = null;
		//let us say you recieve a new message, and
		//store in m and add to InBox of the user
		m = new Message("abc@xyz.com");
		mbox.addToInbox(m);
		m.addRecipeint("a@b.com");
		m.appendBody("Test Email");
		//...
		mbox.send(m);
		mbox.addToDraft(m);
		
		System.out.println(mbox);
		
	}
}
