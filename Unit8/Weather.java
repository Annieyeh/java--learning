package Unit8;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		final int NUMBER_OF_DAYS = 10;
		final int NUMBER_OF_HOURS = 24;
		double[][][] date
		 = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
		
		Scanner input = new Scanner(System.in);
		// Read input using input redirection from a file
		for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
			int day = input.nextInt();
			int hour = input.nextInt();
			double temperature = input.nextDouble();
			double humidity = input.nextDouble();
			date[day - 1][hour - 1][0] = temperature;
			date[day - 1][hour - 1][1] = humidity;
		}
		
		// Find the average daily temperature and humidity
		for (int i = 0; i < NUMBER_OF_DAYS; i++) {
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for (int j = 0; j < NUMBER_OF_HOURS; j++) {
				dailyTemperatureTotal += date[i][j][0];
				dailyHumidityTotal += date[i][j][1];
			}
			
			// Display result
			System.out.println("Day " + i + "'s average temperature is "
					+ dailyTemperatureTotal / NUMBER_OF_HOURS);
			System.out.println("Day " + i + "'s average humidity is "
					+ dailyHumidityTotal / NUMBER_OF_HOURS);
		}
	}
}
