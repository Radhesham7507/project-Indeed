package com.indeed_Clone.Server.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indeed_Clone.Server.Model.PostModel;

public interface PostDao extends MongoRepository<PostModel,String> {

}
