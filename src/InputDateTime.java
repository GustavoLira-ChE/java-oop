import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class InputDateTime {
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter username: ");

        String username = inputObj.nextLine();
        System.out.println("Username is: " + username);

        LocalDateTime myDate = LocalDateTime.now();
        System.out.println(myDate);

        DateTimeFormatter myCustomDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myCustomDate);
        System.out.println(formattedDate);

    }
}
