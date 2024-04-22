package com.iastraining.fundamentals.repository;

import com.iastraining.fundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
