package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
	System.out.println("Enter Start Amount):");
		double startAmount= in.nextDouble ();
	System.out.println("The win probability:");
		double winChance= in.nextDouble ();
	System.out.println("Enter win amount");	
		double winLimit= in.nextDouble ();
		
		double currentAmount = startAmount;
		double playerChance = Math.random();
		
	while (currentAmount> 0 && currentAmount < winLimit) {
		//keep gambling
		if (playerChance <= winChance) {
			//win & reward
		} else if (playerChance > winChance) {
			//lose & money loss
		}
		
	}
		

	

		
	}

}
