package com.indeed_Clone.Server.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Document(collation = "posts")
@Data
public class PostModel {
	
	@NotNull
	@NotEmpty
	private String profile;
	@NotNull
	private String  type;
	@NotNull
	private String description;
	@NotNull
	private String experience;
	@NotNull
	private String technology[];
	@NotNull
	private String salary;
	
	private Date createAt;

}
