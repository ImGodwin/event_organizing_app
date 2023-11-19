package Godwin.event_organizing_app.repositories;

import Godwin.event_organizing_app.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizerRepo extends JpaRepository<Organizer, Integer> {

    Optional<Organizer> findByTitle (String title);

}
