package com.example.demooo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository ticketRepository;
    
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
    
    // Other business logic methods
}

