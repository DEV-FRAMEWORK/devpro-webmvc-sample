/**
 * 
 */
package com.ktds.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author richard-park
 *
 */
@Controller
public class ExampleController {
	
	@GetMapping("/")
	public String Hello(){
		return "index";
	}

}
