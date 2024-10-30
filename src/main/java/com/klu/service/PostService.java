package com.klu.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Location;
import com.klu.model.Posts;
import com.klu.model.Users;

@Service
public class PostService {

	// TODO Auto-generated method stub
	Users user1 = new Users("u1", "Jany", "Lawrence", new Location("l1", "Lagos"), "Jany@gmail.com");

	Users user2 = new Users("u2", "Jadon", "Mills", new Location("l2", "Asaba"), "Jadon@gmail.com");

	Posts post1 = new Posts("p1", "01-Jan-19", user1, "Its good to love and be loved");

	Posts post2 = new Posts("p2", "02-Jan-19", user2, "We all need someone");

	List<Posts> posts = new ArrayList<>(Arrays.asList(post1, post2));

	public List<Posts> getAllPosts() {
		return posts;
	}

	public Posts getPost(String id) {
		Posts post = posts.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);

		return post;
	}

	public void addPost(Posts post) {
		posts.add(post);
	}
	
	
	public void updatePost(String id, Posts post) {

	    for(int i = 0; i < posts.size(); i++) {

		Posts p = posts.get(i);

		if(p.equals(post)) {

		     posts.set(i, post);
		}
	    }
	}
	
	public void deletePost(String id) {
	     posts.removeIf(p -> p.getId().equals(id));		
	}

}
