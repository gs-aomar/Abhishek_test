package com.gainsight.tbs.Services;

import com.gainsight.tbs.DTO.TicketDTO;
import com.gainsight.tbs.POJO.ticket;

import java.util.List;

public interface ServiceLayer
{
    public List<TicketDTO> fetchTicket();
    public TicketDTO putTicket(TicketDTO ticketDTO);


}
