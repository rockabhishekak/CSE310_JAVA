public class Alarm {
    public static void main(String[] args) {
        String day = "FRIDAY";
        String alarm = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "7:00 AM";
            case "SATURDAY", "SUNDAY" -> "9:00 AM";
            default -> "No Alarm Set";
        };
        System.out.println("Alarm is set to: " + alarm);
       
    }
    
}
