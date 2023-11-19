package Godwin.event_organizing_app.PayloadPackages;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UpdateEventDTO(@Size(message = "Description must be minimum 20 characters", min = 20) String description,
                             LocalDate localDate,
                             @Size(message = "Titile must be minimum 10 characters", min = 10) String title,
                             String Location, int postsAvailable, String image, String password) {
}
