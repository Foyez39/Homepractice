package shufflegame;

import java.util.Scanner;

public class Shufflegame {
	
	
	
	
	public static void main(String[] args) {
		//Get user input
		Scanner scan=new Scanner(System.in);
		 System.out.println("-------welcome to Shuffle game--------");
		while(true) {
			System.out.println("Guess where the 0 is ?");
		System.out.println("Are you ready to play? y/n");
		String response=scan.next();
		if(!response.equals("y") && !response.equals("n"))
				{
					System.out.println("you chose invalid thing");
				}
		else if (response.equals("n"))
		{
			break;
		}
		else {
			System.out.println("pick 1,2 or 3");
		}
			String reply=scan.next();
				
			if(!reply.equals("1") && !reply.equals("2") && !reply.equals("3")){
				System.out.println("invalid selection");
			}
			else {
			//Randomly generate opponent move(1,2,3)
			int rand=(int)(Math.random()*3);
			
			String opponentMove="";
			if(rand==1) {
				opponentMove="1";
			}
			else if(rand==2) {
				opponentMove="2";
			}
			else {
				opponentMove="3";
			}
			System.out.println("Opponent move :" + opponentMove);
		
			
			if(reply.equals(opponentMove)) {
				System.out.println("good guess!");
			}
			
			else {
				System.out.println("sorry!wrong guess");
			}

		
			
				
			}
				
		}
		
		System.out.println("Thank You");
		
	}	
	}


