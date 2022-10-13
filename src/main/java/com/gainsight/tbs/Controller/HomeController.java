package com.gainsight.tbs.Controller;
import java.util.*;

import com.gainsight.tbs.POJO.ticket;
import com.gainsight.tbs.Services.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
public class HomeController
{

    @Autowired
    private ServiceLayer serviceLayer;


    @GetMapping("")
    public List<ticket> getCollection()
    {
        return serviceLayer.fetchTicket();
    }

    @PostMapping("")
    public ticket putCollection(@RequestBody ticket tic_obj)
    {
        return serviceLayer.putTicket(tic_obj);
    }

}

/*
MVC architecture

create @service class inside service class call repo methods
when using same url , move it at class level instead of method level
make ticketId as id, shouldn't allow you to insert duplicate records with same ticketId
implement slf4j

 */