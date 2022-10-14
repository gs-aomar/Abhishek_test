package com.gainsight.tbs.DTO;

import com.gainsight.tbs.POJO.Status;
import lombok.Data;


@Data
public class TicketDTO
{
    private int ticketNo;
    private Status status;
    private String time;

}
