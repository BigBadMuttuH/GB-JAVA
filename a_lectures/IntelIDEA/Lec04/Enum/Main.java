package a_lectures.IntelIDEA.Lec04.Enum;

public class Main {
    public static void main(String[] args) {
        for (Weekday weekday : Weekday.values()) {
            System.out.println(weekday+" ("+weekday.getShortName()+") "+
                    (weekday.isWeekend() ? "relax and enjoy" : "work!"));
        }

    }
    // приятно пользоваться Enum вместе со switch
    String workingHours(Weekday weekday) {
        return switch (weekday) {
            case MONDAY, FRIDAY -> "8:00 - 14:00";
            case TUESDAY, THURSDAY -> "14:00 - 17:00";
            case WEDNESDAY, SATURDAY, SUNDAY -> "выходной";
            // Default по Enum можно не писать.
        };
    }
}
