package main.java.br.com.easy.ar_BookingUpForBeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
  String appointmentDateDescription;
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
  
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
      return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
      DateTimeFormatter descriptionFormatter = DateTimeFormatter.ofPattern("\'You have an appointment on\' EEEE, MMMM d, yyyy, \'at\' h:mm a.", Locale.ENGLISH);
        return appointmentDate.format(descriptionFormatter);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate anniversaryDate = LocalDate.of(LocalDate.now().getYear(), 9, 15);
        return anniversaryDate;
    }
}
