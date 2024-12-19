package com.indeed_Clone.Server.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indeed_Clone.Server.Dao.PostDao;
import com.indeed_Clone.Server.Model.PostModel;
import com.indeed_Clone.Server.dto.PostDTO;

@Service
public class PostServiceImpl implements PostService {

	 @Autowired
	    PostDao postDao;

	    @Override
	    public List<PostModel> getAllPosts() {
	        return postDao.findAll();
	    }

	    @Override
	    public PostModel savePost(PostDTO postDTO) {
	        PostModel postModal = new PostModel();

	        postModal.setProfile(postDTO.getProfile());
	        postModal.setType(postDTO.getType());
	        postModal.setSalary(postDTO.getSalary());
	        postModal.setExperience(postDTO.getExperience());
	        postModal.setDescription(postDTO.getDescription());
	        postModal.setTechnology(postDTO.getTechnology());

	        return postDao.save(postModal);
	    }

}
