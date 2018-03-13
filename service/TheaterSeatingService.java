package Seathing.TheaterSeating.service;

import java.util.List;

import Seathing.TheaterSeating.model.TheaterLayout;
import Seathing.TheaterSeating.model.TheaterRequest;

public interface TheaterSeatingService {

	TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

	    
}
