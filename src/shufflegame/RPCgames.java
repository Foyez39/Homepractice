package shufflegame;

import java.util.Scanner;

public class RPCgames {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//create score variables
		int wins=0;
		int losses=0;
		System.out.println("welcome to the games");
		while(true){
			System.out.print("If you want to play type in Rock,Paper or Scissor.If you want to exit the game type in: quit");
			String Myturn =scan.next();
			if(Myturn.equals("quit")) {
				break;
			}
			if(!Myturn.equals("Rock")&& !Myturn.equals("Paper")&& !Myturn.equals("Scissor")) {
				System.out.println("your move isn't valid");
			}
			else {
				//Randomly generate the opponent moves(0,1,2)
				int rnd= (int)(Math.random()*3);
				String computerMove="";
				if(rnd==0) {
					computerMove="Rock";
				}
				else if(rnd==1) {
			computerMove="Paper";
				}
				else {
					computerMove="Scissor";
				}
				
				System.out.println("Computer move is:"+" "+computerMove);
				
				
				//calculate if the user won, lost or tied
				
				if(Myturn.equals(computerMove)) {
					System.out.println("you tied");
				}
				else if(Myturn.equals("Rock")&& computerMove.equals("Scissor")||(Myturn.equals("Scissor")&&computerMove.equals("paper")||(Myturn.equals("paper")&& computerMove.equals("Rock")))) {
					System.out.println("you won!");
					wins++;
				}
					else {
						System.out.println("you lost!");
						losses++;
					}
				}
			System.out.println("you have won"+ wins + "games");
			System.out.println("you have losses"+ losses + "games");
			//check to see if user won more games than the user lost, or lost more games than the user won, or if they were equal
			if(wins>losses) {
				System.out.println("you won more games than you losses");
			}
			else if(wins<losses) {
				System.out.println("you losses more games than you won");
			}
			else {
				System.out.println("you won and losses a equal no.of games");
			}
		}
		System.out.println("Thank you.see you next time");
			
		}
		
		
		
		
		
	}

//this change has beeen done due to git pulling

