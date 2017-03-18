
public class NormalUser extends User
{
    private String [] dept;

    public NormalUser(String roll,String name,String id,String [] dept){
        super(roll,name,id);
        this.dept=dept;
    }

    public String [] getDept(){
        return dept;
    }

    public boolean checkId(){
        return true;
    }

    public boolean checkId(NormalUser u){
        boolean correctId=false;
        if(getId().equals(u.getId())){
            correctId=true;
        }
        return correctId;
    }
}
