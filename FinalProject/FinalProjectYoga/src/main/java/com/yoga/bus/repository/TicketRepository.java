package com.yoga.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoga.bus.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
