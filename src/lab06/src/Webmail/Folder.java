package lab06.src.Webmail;

import java.util.ArrayList;

public class Folder {
	
	private ArrayList<Message> messages = new ArrayList<Message>();

    public void add(Message msg) {
        messages.add( msg );
    }
    
    public void remove(long msg_id) {
    	for(int i = 0;i<messages.size();i++){
    		
    		Message temp = messages.get(i);
    		
    		if(temp.getMesg_id() == msg_id){
    			messages.remove(i);
    			break;
    		}
    	}
    }    
}
