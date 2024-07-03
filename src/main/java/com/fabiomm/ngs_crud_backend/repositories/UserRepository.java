package com.fabiomm.ngs_crud_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fabiomm.ngs_crud_backend.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    
}
