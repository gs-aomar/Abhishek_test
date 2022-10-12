package com.gainsight.tbs.Services;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<ticket,Integer>
{
}
