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
			playerChance = Math.random();
			
			if (playerChance <= winChance) {
				//win & reward
				currentAmount++;
				System.out.println("You won $1");
			} else if (playerChance > winChance) {
				//lose & money loss
				currentAmount--;
				System.out.println("You lost $1");
			}

		}

		if (currentAmount <= 0) {
			System.out.println("You are ruined!");
		} else if (currentAmount >= winLimit) {
			System.out.println("You won!");
		}




	}

}
