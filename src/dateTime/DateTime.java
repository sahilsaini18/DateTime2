package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Firstly, I have taken input string DateTimeFormatter is used to format the
 * time Then the user string is parsed, and operations are performed
 */
public class DateTime {
	private static final Logger log = Logger.getLogger(DateTime.class.getName());

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		log.info("Enter date and time (dd/MM/yyyy HH:mm): ");
		String userInput = scanner.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDateTime inputDateTime = LocalDateTime.parse(userInput, formatter);

		// Perform operations
		LocalDateTime plusOneDay = inputDateTime.plusDays(1);
		LocalDateTime minusTenDays = inputDateTime.minusDays(10);

		log.info("Original Date and Time: " + inputDateTime.format(formatter));
		log.info("Date and Time after adding one day: " + plusOneDay.format(formatter));
		log.info("Date and Time after subtracting 10 days: " + minusTenDays.format(formatter));

		scanner.close();
	}
}
