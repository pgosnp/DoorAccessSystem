
public class Admin extends User
{
    public Admin(String roll,String name,String id){
        super(roll,name,id);
    }
    
    public boolean checkId(){
        return true;
    }

    public boolean checkId(User u){
        return true;
    }
}
