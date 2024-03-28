package com.nelioalves.worshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.worshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
