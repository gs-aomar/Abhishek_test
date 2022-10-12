package com.gainsight.tbs.Services;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "TBS")
public class ticket
{

    private int ticketNo;
    private Status status;
    private String time;

    public ticket() {

    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDateTime() {return time;}

    public void setDateTime(String dateTime)
    {
        this.time = dateTime;
    }

    @Override
    public String toString() {
        return "Collection{" + "ticketNo=" + ticketNo + ", Status='" + status + '\'' + ", dateTime=" + time + '}';
    }
}
