package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
