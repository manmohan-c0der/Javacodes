import java.util.Scanner;
import java.util.Random;
class Game{
    private  int Guessnum=0;
    private int Usernum;
    public int  comnum;
    public int getGuess(){
        return Guessnum;
    }
    public void setnum(int Guessnum){
       this.Guessnum=Guessnum;

    }
     Game(){
       Random random=new Random();
       comnum=random.nextInt(101);
     }
     public void Userinput(){
        System.out.println("Guess the numebr ");
        Scanner sc=new Scanner(System.in);
       Usernum=sc.nextInt(); 
     }
    boolean iscorectNUmber(){
         Guessnum++;
         if(comnum==Usernum){
            System.out.println("yes you guess correct Number "+comnum+" and "+Guessnum);
            return true;
            
         }
         else if(comnum>Usernum){
            System.out.println("it is less than ");
         }
         else{
            System.out.println("it is greater than");
         }
        return false;

     }
 
}


public class GessNum {
    public static void main(String[] args) {
     
        Game ob=new Game();
        boolean b=false;
        while(!b){
            ob.Userinput();
            ob.iscorectNUmber();
    
        }

    }
    
}
