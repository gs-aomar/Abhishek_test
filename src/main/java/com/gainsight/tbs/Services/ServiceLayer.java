package com.gainsight.tbs.Services;

import com.gainsight.tbs.POJO.ticket;

import java.util.List;

public interface ServiceLayer
{
    public List<ticket> fetchTicket();
    public ticket putTicket(ticket tic_obj);


}
