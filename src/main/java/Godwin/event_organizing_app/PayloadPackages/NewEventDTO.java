package Godwin.event_organizing_app.PayloadPackages;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record NewEventDTO(@NotEmpty(message = "Please add a description") @Size(message = "Description must be minimum 20 characters", min = 20) String description,
                          @NotEmpty(message = "Please add a date")LocalDate date,
                          @NotEmpty(message = "Please add a title") @Size(message = "Title must be min 10 characters", min = 10) String title,
                          @NotEmpty(message = "Please add a location") String Location,
                          @NotEmpty(message = "Please add number of posts avaialable") int postsAvailable){

}
