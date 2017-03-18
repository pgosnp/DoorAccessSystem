
public class Door
{
    private String id;
    private String startTime;
    private String endTime;
    private String [] dept;
    private String roll;
    private String [] exception; 

    public Door(String id ,String startTime,String endTime,String [] dept,String roll,String [] exception){
        this.id=id;
        this.startTime=startTime;
        this.endTime=endTime;
        this.dept=dept;
        this.roll=roll;
        this.exception=exception;

    }

    public String getId(){
        return id;
    }

    public String getStartTime(){
        return startTime;
    }

    public String getEndTime(){
        return endTime;
    }

    public String [] getDept(){
        return dept;
    }

    public String getRoll(){
        return roll;
    }

    public String [] getException(){
        return exception;
    }

    public boolean checkId(){
        return true;
    }

    public boolean checkId(Door d){
        return true;
    }
}
