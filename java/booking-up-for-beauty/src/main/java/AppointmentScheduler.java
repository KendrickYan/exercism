import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    // formatters are immutable and thread safe, so just make them static + final
    private static final DateTimeFormatter PARSER =
            DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER =
            DateTimeFormatter.ofPattern("EEEE, LLLL d, yyyy, 'at' h:mm a'.'") // enclose literals with single quotes
            .withLocale(Locale.US); // because my locale does not capitalise am/pm by default

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, PARSER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return 12 <= hour && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String formattedDatetime = DESCRIPTION_FORMATTER.format(appointmentDate);
        return "You have an appointment on " + formattedDatetime;
    }

    public LocalDate getAnniversaryDate() {
        int yearNow = LocalDate.now().getYear();
        return LocalDate.of(yearNow, 9, 15);
    }
}
