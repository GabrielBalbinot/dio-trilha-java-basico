package application;

import java.util.Scanner;

import dio.gof.strategy.AgressiveBehavior;
import dio.gof.strategy.Behavior;
import dio.gof.strategy.DefensiveBehavior;
import dio.gof.strategy.NormalBehavior;
import dio.gof.strategy.Robot;

public class Program {

	public static void main(String[] args) {
		
		Behavior aggro = new AgressiveBehavior();
		Behavior def = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		
		Robot robot = new Robot();
		
		Scanner sc = new Scanner(System.in);
		
		int moves = 0;
		
		while (moves < 5) {
			
			System.out.print("Escolha uma ação agressiva, defensiva ou normal (a, d, n): ");
			char action = sc.nextLine().charAt(0);
			
			switch (action) {
				
				case 'a': robot.setBehavior(aggro); break;
				case 'd': robot.setBehavior(def); break;
				case 'n': robot.setBehavior(normal); break;
				default: System.out.println("Ação não entendida. Realizando a atual...");
			}
			
			robot.move();	
						
			moves++;
			
		}
		
		sc.close();

	}

}
