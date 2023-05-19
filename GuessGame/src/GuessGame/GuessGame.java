package GuessGame;
import java.util.*;
public class GuessGame {

	public static void main(String[] args) {
		   System.out.println("<=====Guessing Game=====>");

		   Scanner myObj  = new Scanner(System.in);

		   double random;

		   String pos[]= {"*Dhuru mia jitsen","*khaiya asen +","*u got burger","*lol amne pailen"};

		   String neg[]= {"*ho bhai apni gesen","*wow here gelen","*khaiya felsi burger ja","*vabir kase jan"};   

		   

		   System.out.print("How many round you want to play: ");

		   int round =myObj.nextInt();

		   int num;

		   

		   int point=0;

		   int win=0;

		   int lost=0;

		   while(round>0) {

		   Random rand=new Random();

		   random = rand.nextInt(10)+1;

		   int com = rand.nextInt(4);

		   num=(int)random;

		   System.out.print("Enter your guess number between 1-10 : ");

		   int guess=myObj.nextInt();

		   if(num==guess) {

		    point++;

		    win++;

		    System.out.println(pos[com]+"\nRight Guess\nYou Earn 1 Point\n");

		   }else {

		    point--;

		    lost++;

		    System.out.println(neg[com]+"\nWrong Guess\nYou Lost 1 Point\n");

		    System.out.println("Right number was "+num);

		   }

		   System.out.println("<>##Your Point ="+point+" ##<>\n\n");

		   round--;}

		   if(point<=0)System.out.println("\n\n*****You Lost Game******\n\tWin : "+win+" Time\tLost : "+lost+" Time\n");

		   else System.out.println("\n\nWOW!\n*****You Win The Game******\n\tWin : "+win+" Time\tLost : "+lost+" Time\n");


	}

}
