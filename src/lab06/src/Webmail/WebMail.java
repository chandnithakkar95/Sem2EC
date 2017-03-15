package lab06.src.Webmail;

import java.util.HashMap;

public class WebMail {

    public void addUser(User usr){
        users.put(usr.getName(), usr);
    }

    public User login(String usr_name, String pwd) {
        User usr = null;
        usr = users.get(usr_name);
        return usr.equals(pwd) ?usr:null;
       
    }
    
    public void deleteUser(User usr){
    	users.remove(usr.getName());
        //
    }
    public String save(){
        return "Saved";
    } 
    public String read(){
        return "Reading";
    } 
    
    private HashMap<String, User> users = new HashMap<String, User>();


}
