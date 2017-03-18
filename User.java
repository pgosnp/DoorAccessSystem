
public abstract class User implements Checkable
{
    private String roll;   
    private String name;
    private String id;

    public User(String roll,String name,String id){
        this.roll=roll;
        this.name=name;
        this.id=id;
    }

    public String getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    //     public abstract boolean checkId();
}
