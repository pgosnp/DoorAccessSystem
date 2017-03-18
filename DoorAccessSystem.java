import java.util.*;
import java.io.*;

public class DoorAccessSystem
{
    public static void main(String [] args){

        File doorFile = new File("door.dat");
        File userFile = new File("user.dat");

        Scanner inputDoor =null;
        ArrayList<Door> doorList = new ArrayList<Door>();
        ArrayList<User> userList = new ArrayList<User>();
        Scanner keyboard = new Scanner(System.in);
        String userId=null;
        User user = null;
        User loginUser=null;
        boolean isProgramRun = true;
        boolean correctId = false;
        int option = 0;

        try{
            inputDoor = new Scanner(doorFile);
            while(inputDoor.hasNext()){
                String data = inputDoor.nextLine();
                String [] token = data.split("\t");
                String [] deptArr = token[3].split(";"); 
                String [] exArr = token[5].split(";");              
                doorList.add(new Door(token[0],token[1],token[2],deptArr,token[4],exArr));
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find this file");
        }
        finally{
            inputDoor.close();
        }

        Scanner inputUser =null;
        try{
            inputUser = new Scanner(userFile);
            while(inputUser.hasNext()){
                String data = inputUser.nextLine();
                String [] token = data.split("\t");
                String [] deptArr = token[3].split(";"); 
                if(token[0].equals("Administrator")){
                    userList.add(new Admin(token[0],token[1],token[2]));
                }
                else{
                    userList.add(new NormalUser(token[0],token[1],token[2],deptArr));}
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find this file");
        }
        finally{
            inputUser.close();
        }

        System.out.println("Welcome to door access system.");

        do{
            if(loginUser==null){
                do{
                    System.out.println("Please enter a user id...or type -1 to exit");
                    userId = keyboard.nextLine();
                    for(int i=0; i<userList.size();i++){            
                        if(userId.equals(userList.get(i).getId())){
                            loginUser = userList.get(i);
                            correctId=true;
                        }
                    }
                    if(correctId==false){
                        System.out.println("Invalid input");
                    }
                    if(userId.equals("-1")){
                        isProgramRun=false;
                    }
                    System.out.println(correctId);
                } while(correctId==false);
            }
            else{

                if(loginUser instanceof Admin){                  
                    System.out.println("Hello, " + userList.get(0).getRoll() + ": " + userList.get(0).getName() );
                    System.out.println("Menu:");
                    System.out.println("1 View a door");
                    System.out.println("2 View a user");                
                    System.out.println("-1 Quit");
                    option = keyboard.nextInt();
                    keyboard.nextLine();

                }

                else if(loginUser instanceof NormalUser){

                }                            
            }           
        }while(isProgramRun==true);
    }
}
