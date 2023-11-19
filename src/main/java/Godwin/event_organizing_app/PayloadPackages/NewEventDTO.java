package Godwin.event_organizing_app.PayloadPackages;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;

public record NewEventDTO(@NotEmpty(message = "Please add a description") String description,
                          @NotEmpty(message = "Please add a date")LocalDate date,
                          @NotEmpty(message = "Please add a title") String title,
                          @NotEmpty(message = "Please add a location") String Location,
                          @NotEmpty(message = "Please add number of posts avaialable") int postsAvailable){

}
