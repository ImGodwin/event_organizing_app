package Godwin.event_organizing_app.services;

import Godwin.event_organizing_app.entities.Organizer;
import Godwin.event_organizing_app.exceptions.NotFoundException;
import Godwin.event_organizing_app.repositories.OrganizerRepo;
import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepo organizerRepo;

    @Autowired
    private Cloudinary cloudinary;

    public Page<Organizer> getOrganizers(int page, int size, String orderBy){

        Pageable pageable = PageRequest.of(page, size, Sort.by(orderBy));
        return organizerRepo.findAll(pageable);
    }

    /*public Organizer findById(int id) throws NotFoundException {

        return organizerRepo.findById(id).orElseThrow(() -> new NotFoundException(id));
    }*/



}
