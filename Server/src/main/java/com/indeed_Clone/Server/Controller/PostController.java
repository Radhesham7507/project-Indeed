package com.indeed_Clone.Server.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indeed_Clone.Server.Model.PostModel;
import com.indeed_Clone.Server.Service.PostService;
import com.indeed_Clone.Server.constants.APIConstants;
import com.indeed_Clone.Server.dto.PostDTO;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

	final PostService postService;
	
	
	
	
	@PostMapping(APIConstants.SAVE_POST)
	public PostModel savePost( @Valid @RequestBody PostDTO postDTORequest  )
	{
		log.info("Saving post####");
		
		
		return this.postService.savePost(postDTORequest);
		
	}
	
	@GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }
}
