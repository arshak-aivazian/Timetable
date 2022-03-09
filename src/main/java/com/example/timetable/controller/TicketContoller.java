package com.example.timetable.controller;

import com.example.timetable.dto.BuyRequestDto;
import com.example.timetable.entity.TicketEntity;
import com.example.timetable.service.ticket.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/tickets")
@RequiredArgsConstructor
public class TicketContoller {
    private final TicketService ticketService;

    @PostMapping
    public TicketEntity buyTicket(@RequestBody @Valid BuyRequestDto buyRequestDto) {
        return ticketService.buyTicket(buyRequestDto);
    }
}
