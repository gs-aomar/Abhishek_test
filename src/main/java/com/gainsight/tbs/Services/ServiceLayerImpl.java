package com.gainsight.tbs.Services;

import com.gainsight.tbs.POJO.ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayerImpl implements ServiceLayer{

    @Autowired
    PostRepo repo;

    Logger logger = LoggerFactory.getLogger("SampleLogger");

    @Override
    public List<ticket> fetchTicket() {
        logger.info("Hii fetching all the information of the tickets");
        return repo.findAll();
    }

    @Override
    public ticket putTicket(ticket tic_obj) {
        logger.info("Hii saving the information of the tickets");
        return  this.repo.save(tic_obj);
    }


}
