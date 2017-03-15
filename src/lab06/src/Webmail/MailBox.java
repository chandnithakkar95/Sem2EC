package lab06.src.Webmail;

import java.util.ArrayList;

public class MailBox {

    public void send(Message m) {
        sent.add( m );
    }

    public void addToInbox(Message m) {
        inbox.add( m );
    }

    public void addToDraft(Message m) {
        draft.add( m );
    }
    
    @Override
    protected MailBox clone() throws CloneNotSupportedException {

        MailBox cloned = (MailBox) super.clone();
        //cloned.inbox = this.inbox.clone();
        //cloned.sent = this.sent.clone();
    
        return cloned;
    }
    
    public String toString(){
    	String temp = "";
    	temp+= inbox.get(0).getMesg_id(); 
    	return temp;
    }

    private ArrayList<Message> inbox = new ArrayList<Message>();
    private ArrayList<Message> draft = new ArrayList<Message>();
    private ArrayList<Message> sent = new ArrayList<Message>();
    private ArrayList<Folder> folders = new ArrayList<Folder>();  

}
