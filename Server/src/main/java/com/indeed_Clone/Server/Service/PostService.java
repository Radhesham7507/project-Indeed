package com.indeed_Clone.Server.Service;

import java.util.List;

import com.indeed_Clone.Server.Model.PostModel;
import com.indeed_Clone.Server.dto.PostDTO;

public interface PostService { 
	
	public PostModel savePost(PostDTO postDTO); 
	
	public List<PostModel> getAllPosts();
	
	

}
