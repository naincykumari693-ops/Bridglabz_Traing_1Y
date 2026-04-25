import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Patient heart rate high", "CRITICAL"),
                new Alert("Routine check reminder", "NORMAL"),
                new Alert("Low battery warning", "LOW")
        );

        // Predicate to filter only CRITICAL alerts
        Predicate<Alert> isCritical = a -> a.type.equals("CRITICAL");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(isCritical)
              .forEach(a -> System.out.println(a.message));
    }
}