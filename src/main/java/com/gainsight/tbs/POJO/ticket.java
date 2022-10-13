package com.gainsight.tbs.POJO;
import com.gainsight.tbs.POJO.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TBS")
public class ticket
{
    @Id
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
