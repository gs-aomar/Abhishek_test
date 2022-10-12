package com.gainsight.tbs.Controller;
import java.util.*;

import com.gainsight.tbs.Services.PostRepo;
import com.gainsight.tbs.Services.ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
public class HomeController
{

    @Autowired
    private PostRepo repo;

    @GetMapping("")
    public List<ticket> getCollection()
    {
        return this.repo.findAll();
    }

    @PostMapping("")
    public ticket putCollection(@RequestBody ticket tic_obj)
    {
           return  this.repo.save(tic_obj);
    }

}

/*
MVC architecture

create @service class inside service class call repo methods
when using same url , move it at class level instead of method level
make ticketId as id, shouldn't allow you to insert duplicate records with same ticketId
implement slf4j

 */