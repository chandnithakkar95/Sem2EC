package lab06.src.Webmail;

public class User extends WebMail{

	
	public User(String user_name, String pwd){
		setName(user_name);
		setPasswd(pwd);
	//	super(user_name,pwd);
	}
	public boolean equals(String pwd){
		return pwd == this.passwd;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public MailBox getMbox() {
		return mbox;
	}


	public void setMbox(MailBox mbox) {
		this.mbox = mbox;
	}

	private String name;
	private String passwd;
	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	private MailBox mbox = new MailBox();
}
