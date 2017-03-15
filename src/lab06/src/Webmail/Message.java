package lab06.src.Webmail;

import java.util.ArrayList;

import javax.activation.MimeType;

public class Message {
	

    private ArrayList<String> to = new ArrayList<String>();
    private ArrayList<String> toCC = new ArrayList<String>();
    private ArrayList<String> toBCC = new ArrayList<String>();
    private ArrayList<MimeType> attachments = new ArrayList<MimeType>();
    private String sender;
    private String body;
    
    private long mesg_id;
   
    private static long NEXT_MESG_ID = 0;

    public Message(String sendr) {
        sender = sendr;
        setMesg_id(++NEXT_MESG_ID);
    }
    public void addRecipeint(String tostr) {
        to.add( tostr );
    }
    public void addCC(String tostr) {
        toCC.add( tostr );
    }
    public void addBCC(String tostr) {
        toBCC.add( tostr );
    }
    public void addAttachments(MimeType obj) {
        attachments.add( obj );
    }
    public void appendBody(String  str ) {
        body += str;
    }
    @Override
    public boolean equals(Object message) {

        Message msg = (Message) message;
        return this.getMesg_id() == msg.getMesg_id();
    }
	public long getMesg_id() {
		return mesg_id;
	}
	public void setMesg_id(long mesg_id) {
		this.mesg_id = mesg_id;
	}
}
