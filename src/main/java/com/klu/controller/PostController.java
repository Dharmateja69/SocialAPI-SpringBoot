package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Posts;
import com.klu.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/posts")
	public List<Posts> getAllPosts() {

		return postService.getAllPosts();
	}

	@RequestMapping(value = "/posts/{id}")
	public Posts getPost(@PathVariable String id) {
		return postService.getPost(id);
	}

	@RequestMapping(value = "/posts", method = RequestMethod.POST)
	public void addPost(@RequestBody Posts post) {
		postService.addPost(post);
	}

	
	
	@RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
	public void updatePost(@PathVariable String id, @RequestBody Posts post) {

	      postService.updatePost(id, post);

	}
	
	 @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
	 public void deletePost(@PathVariable String id) {
	     postService.deletePost(id);
	 }
	
	
}
