package com.spring.restapi.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.crud.entity.User;


@Repository
public interface AppRepoRepository extends CrudRepository<User, Integer> {

}
