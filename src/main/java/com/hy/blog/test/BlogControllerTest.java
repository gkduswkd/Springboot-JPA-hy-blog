package com.hy.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hellow() {
		return "<h1>hello sping boot</h1>";
	}
}
