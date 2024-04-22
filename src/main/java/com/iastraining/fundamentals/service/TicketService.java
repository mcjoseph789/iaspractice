package com.iastraining.fundamentals.service;

import com.iastraining.fundamentals.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}
