package ru.kolesnik.cinemarestservice.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketReturnResponse {

    private final TicketDto returnedTicketDto;

    public TicketReturnResponse(TicketDto returnedTicketDto) {
        this.returnedTicketDto = returnedTicketDto;
    }

    @JsonProperty("returned_ticket")
    public TicketDto getReturnedTicketDto() {
        return returnedTicketDto;
    }
}
