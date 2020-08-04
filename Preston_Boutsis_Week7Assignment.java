//Preston Boutsis
//generate the game scores using random numbers and store them in a two-dimensional array.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Preston_Boutsis_Week7Assignment {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

	System.out.println("-----------------------------------------------------------------");
	System.out.println("Football Team Randomized Season Scores");
	System.out.println("-----------------------------------------------------------------");

	//user will determine number of teams and number of games

	int teams = 0;
	int games = 0;
	int min = 0;
	int max = 200;

	//Total and Avg columns on report will align well when qty of 5 games entered
	
	System.out.print("Enter the number of teams: ");
	teams = input.nextInt();

	System.out.print("Enter the number of games: ");
	games = input.nextInt();

	System.out.println("-----------------------------------------------------------------");

	int [][] x = new int [teams][games];

	for (int i = 0; i < teams; i++)
		{
			for (int j = 0; j < games; j++)
			{
				x[i][j] = rand.nextInt((max - min) + 1) + min;
			}
		}	
	System.out.println();

	System.out.println("-----------------------------------------------------------------");
	System.out.println("Football Scores Report");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("Team \t Scores \t\t\t\t\t Tot \t Avg");
	System.out.println("-----------------------------------------------------------------");
	System.out.println();

	//report will generate for user's quantity of teams with randomly generated scores for each game, then list the sum of each team's scores and their average
	
	int topTeam = 0;
	int topTotal = 0;

	for (int i = 0; i < teams; i++)
	{
		int teamTotal = 0;
		int teamAvg = 0;
		System.out.print((i + 1) + ":\t");
			
		for (int j = 0; j < games; j++)
		{
			System.out.print(x[i][j] + "\t");
			teamTotal = teamTotal + x[i][j];
		}

		if (teamTotal > topTotal)
		{
			topTotal = teamTotal;
			topTeam = i + 1;
		}

		teamAvg = teamTotal / games;
		System.out.print("\t" + teamTotal);
		System.out.print("\t" + teamAvg);
		System.out.println();
	}
	
	System.out.println("-----------------------------------------------------------------");

	System.out.println("Top Team: Team " + topTeam);

	System.out.println("-----------------------------------------------------------------");

	}
}
