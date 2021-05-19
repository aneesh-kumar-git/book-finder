package com.library.bookfinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class MainController {
	@RequestMapping("/home")
	public String showHome() {
		return "Welcome User!";
	}
}
