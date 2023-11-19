package Godwin.event_organizing_app.PayloadPackages;

import java.util.Date;

public record ErrorsDTO(String message, Date errorTimeStamp) {
}
