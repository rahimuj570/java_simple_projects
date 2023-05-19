package RockPaperScissors;
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random rand=new Random();
		int round;
		String name;
		System.out.println("Hi! My Name is *Mr. PC*\n\tWhat's your name?");
		name=input.nextLine();
		System.out.println(name+" is a nice name. Let's Play Rock-Pacper-Scissors!");
		int agree;
		while(true){
			System.out.println("Insert key (1 or 0) according to your wise =>");
			System.out.println("\tYes => 1\tNo =>0");
			agree=input.nextInt();
			if(agree==1 || agree==0){break;}
			else{System.out.println("Wrong Key! Insert Valid Key");}
		}
		if(agree==0)System.out.println("Okay! No Problem, We'll Play Next Time");
		else if(agree==1) {
		System.out.print("That's Great! How Many Round You Want to Play: \n\n");
		round=input.nextInt();
		int t=1;
		String arr[]= {"Rock","Paper","Scissors"};
		String myMoves[]= {"Rock","Paper","Scissors"};
		int move=0,indx,pc=0,me=0;
		while(t<=round) {
			indx=rand.nextInt(3);
			while(true){
			System.out.println("######## Round :"+t);
			System.out.println("Choose Your Move via Insert Key (1-3) ;)");
			System.out.println("\tFor Rock => 1\n\tFor Paper => 2\n\tFor Scissor => 3");
			move=input.nextInt();
			//Check Move
			if(move>3 || move<1){System.out.println("Wrong Move! Insert Valid Move Key (1-3)\n");
			}else break;}
			
			//Logic Start
			
			System.out.println("Mr PC : "+arr[indx]+'\t'+name+": "+myMoves[move-1]);
			if(indx==0 && move==2) {
				System.out.println("Awesome! Paper Wrapped the Rock\n You Got 1 Point\n\n");
				me++;
			}else if(indx==0 && move==3) {
				System.out.println("Oho! Rock Break the Scissors\n Mr. PC Got 1 Point\n\n");
				pc++;
			}else if(indx==1 && move==1) {
				System.out.println("Oho! Paper Wrapped the Rock\n Mr. PC Got 1 Point\n\n");
				pc++;
			}else if(indx==1 && move==3) {
				System.out.println("Yahoo! Scissors Cut the Paper\n You Got 1 Point\n\n");
				me++;
			}else if(indx==2 && move==1) {
				System.out.println("Great! Rock Break the Scissors\n You Got 1 Point\n\n");
				me++;
			}else if(indx==2 && move==2) {
				System.out.println("So Sad! Scissors Cut the Paper\n You Loss 1 Point\n\n");
				pc++;
			}else {
				System.out.println("\n\tMr. PC and You Showed The Sane Sign\n\t**So This Round Will be Played Again**\n");
				t--;
			}
			t++;
		}
		
		System.out.println("\n\n==========RESULT==========\n Mr. PC got "+'"'+pc+'"'+" Point\t"+name+" got "+'"'+me+'"'+" Point");
		if(pc>me)System.out.println("Mr. PC Win!");
		else if(pc<me)System.out.println("You Win!");
		else System.out.println("No one win this Game");

	}
		}
	
}
