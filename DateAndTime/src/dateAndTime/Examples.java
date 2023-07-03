package dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Examples {
    public static void main(String[] args) {
        // LocalDate example
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        // LocalTime example
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // LocalDateTime example
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        // Formatting example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}

