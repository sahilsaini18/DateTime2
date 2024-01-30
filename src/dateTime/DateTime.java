package dateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * Firstly i have taken input string 
 * DateTimeFormatter is used to format the time
 * Then the user string is parsed and operation is performed
 */
public class DateTime {
	public static void main(String[] args) {
        
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter date and time (dd/MM/yyyy HH:mm): ");
	        String userInput = scanner.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	        LocalDateTime inputDateTime = LocalDateTime.parse(userInput, formatter);

	        // Perform operations
	        LocalDateTime plusOneDay = inputDateTime.plusDays(1);
	        LocalDateTime minusTenDays = inputDateTime.minusDays(10);

	 
	        System.out.println("Original Date and Time: " + inputDateTime.format(formatter));
	        System.out.println("Date and Time after adding one day: " + plusOneDay.format(formatter));
	        System.out.println("Date and Time after subtracting 10 days: " + minusTenDays.format(formatter));

	        scanner.close();
	}



}
