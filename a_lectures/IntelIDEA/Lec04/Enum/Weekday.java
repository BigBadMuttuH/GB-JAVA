package a_lectures.IntelIDEA.Lec04.Enum;

enum Weekday {
    MONDAY("MON", false),
    TUESDAY("THU", false),
    WEDNESDAY("WED", false),
    THURSDAY("THU", false),
    FRIDAY("FRI", false),
    SATURDAY("SAT", true),
    SUNDAY("SUN", true);

    private final String shortName;
    private final boolean weekend;

    Weekday(String shortName, boolean weekend) {
        this.shortName = shortName;
        this.weekend = weekend;
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isWeekend() {
        return weekend;
    }
}

