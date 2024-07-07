package com.openclassroom.repository;

import com.openclassroom.model.DBUser;
import org.springframework.data.repository.CrudRepository;

public interface DBUserRepository extends CrudRepository<DBUser, Integer> {

    public DBUser findByUsername(String username);
}
